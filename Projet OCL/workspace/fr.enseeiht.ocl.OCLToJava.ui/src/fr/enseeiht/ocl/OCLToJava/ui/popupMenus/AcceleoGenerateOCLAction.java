/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package fr.enseeiht.ocl.OCLToJava.ui.popupMenus;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.acceleo.engine.service.AcceleoService;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import fr.enseeiht.ocl.OCLToJava.ui.Activator;
import fr.enseeiht.ocl.OCLToJava.ui.common.GenerateAll;
import fr.enseeiht.ocl.OCLToJava.ui.common.GenerateFromEcore;
import fr.enseeiht.ocl.xtext.ocl.Import;

import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;

/**
 * TOCL code generation.
 */
public class AcceleoGenerateOCLAction extends ActionDelegate implements IActionDelegate {

	/**
	 * Selected model files.
	 */
	private List<IFile> files;
	private String selectedFilePath;

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
	 *      org.eclipse.jface.viewers.ISelection)
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			files = ((IStructuredSelection) selection).toList();
			System.out.println(files);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#run(org.eclipse.jface.action.IAction)
	 * @generated NOT
	 */
	public void run(IAction action) {
		if (files != null && files.size() == 1) {
			
			// Ouverture d'un dialogue pour choisir un .xmi 
			Display.getDefault().syncExec(() -> {
				Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getSelection();
				if (selection instanceof IStructuredSelection) {
					Object element = ((IStructuredSelection) selection).getFirstElement();
					if (element instanceof IAdaptable) {
						IResource resource = ((IAdaptable) element).getAdapter(IResource.class);
						if (resource != null) {
							IProject project = resource.getProject();
							String projectPath = project.getLocation().toOSString();

							FileDialog fileDialog = new FileDialog(shell, SWT.OPEN);
							fileDialog.setText("Choisir un fichier XMI à valider");
							fileDialog.setFilterExtensions(new String[] { "*.xmi" });
							fileDialog.setFilterPath(projectPath);
							selectedFilePath = fileDialog.open();
						}
					}
				}
			});

			if (selectedFilePath != null) {
				// Fichier .xmi sélectionné
				File selectedFile = new File(selectedFilePath);
				String fileNameSelected = selectedFile.getName();
				System.out.println("Selected File Name: " + fileNameSelected);


				// Description de l'opération
				IRunnableWithProgress operation = new IRunnableWithProgress() {
					public void run(IProgressMonitor monitor) {
						try {
							// fichier .tocl
							IFile model = files.get(0); 
							URI modelURI = URI.createPlatformResourceURI(model.getFullPath().toString(), true);
							System.out.println("URI : " + modelURI);
							
							IContainer targetFolder = null;

							Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
							reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

							System.out.println("alaide");
							
							// Récupère le EPackage correspondant au .ecore importé dans le .tocl
							ResourceSet resSet = new ResourceSetImpl();
							Resource resource = resSet.getResource(modelURI, true);
							EPackage ePackages = null;
							System.out.println("starting steps");
							for (EObject eObject : resource.getContents()) {
								System.out.println("Main step : " + eObject);
								TreeIterator<EObject> iterator = EcoreUtil.getAllContents(eObject, true);
								while (iterator.hasNext()) {
									EObject obj = iterator.next();
									System.out.println("Step : " + obj);
									System.out.println(obj.getClass());
									if (obj instanceof Import) {

										System.out.println(obj.getClass());
										if (ePackages == null) {
											ePackages = ((Import) obj).getPackage();
										} else {
											System.out.println("WARNING ! Only 1 import is supported");
										}
									}
								}
							}
							System.out.println("Final :" + ePackages);


							// Génération du code Java pour l'exploration du .ecore (s'appuie sur le code généré par le .genmodel)
							String fileName = "";
							if (ePackages != null) {
								System.out.println("Start generate from Ecore");
								
								// Récupère le fichier .ecore
								try {
									System.out.println("MM URI : " + ePackages.eResource().getURI());
									String uri = String.valueOf(ePackages.eResource().getURI());
									fileName = uri.substring(uri.lastIndexOf('/') + 1, uri.lastIndexOf('.'));
								} catch (NullPointerException e) {
									System.out
											.println("Essayez d'enlever la configuration de XText du projet et de la remettre.");
									System.out.println("Verifiez que le EPackage n'est plus à null dans le .tocl");
									throw e;
								}

								// Transformation Acceleo
								try {
									IContainer target = model.getProject().getFolder("src");
									targetFolder = target;
									GenerateFromEcore generator = new GenerateFromEcore(ePackages.eResource().getURI(),
											targetFolder, getArguments());
									generator.doGenerate(monitor);
								} catch (IOException e) {
									IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
									Activator.getDefault().getLog().log(status);
								} finally {
									if (targetFolder != null) {
										targetFolder.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
									}
								}
								
								System.out.println("End generate from Ecore");
							}

							
							// Génération du code Java du .tocl
							System.out.println("Start generate from TOCL");
							try {
								// Transformation Acceleo
								IContainer target = model.getProject().getFolder("src/ocl");
								targetFolder = target;
								GenerateAll generator = new GenerateAll(modelURI, targetFolder, getArguments());
								generator.doGenerate(monitor);
							} catch (IOException e) {
								IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
								Activator.getDefault().getLog().log(status);
							} finally {
								if (targetFolder != null) {
									targetFolder.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
								}
							}
							System.out.println("End generate from TOCL");

							
							// What the fuck
							System.out.println("Start launching program");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}

							
							// Lancement de ocl.Validate<nom> (Java généré par .tocl) avec le .xmi en paramètre
							try {
								IProject project = model.getProject();
								ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
								ILaunchConfigurationType configType = launchManager.getLaunchConfigurationType(
										IJavaLaunchConfigurationConstants.ID_JAVA_APPLICATION);
								ILaunchConfigurationWorkingCopy workingCopy = configType.newInstance(null,
										"Launch Configuration");

								workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME,
										project.getName());
								workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME,
										"ocl.Validate" + fileName.substring(0, 1).toUpperCase()
												+ fileName.substring(1).toLowerCase());

								String programArgs = fileNameSelected;
								workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS,
										programArgs);

								ILaunchConfiguration configuration = workingCopy.doSave();
								ILaunch launch = configuration.launch(ILaunchManager.RUN_MODE, monitor);

								monitor.beginTask("Launching Java Application", IProgressMonitor.UNKNOWN);
								while (!launch.isTerminated()) {
									if (monitor.isCanceled()) {
										launch.terminate();
										throw new InterruptedException("Canceled");
									}
									Thread.sleep(1000);
								}
								monitor.done();
							} catch (Exception e) {
								IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
								Activator.getDefault().getLog().log(status);
							}
							System.out.println("End launching program");

						} catch (CoreException e) {
							IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
							Activator.getDefault().getLog().log(status);
						}
					}
				};
				
				
				// Exécution de l'opération
				try {
					PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
				} catch (InvocationTargetException e) {
					IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
					Activator.getDefault().getLog().log(status);
				} catch (InterruptedException e) {
					IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
					Activator.getDefault().getLog().log(status);
				}
			} else {
				System.out.println("No file selected");
			}
		}
	}

	/**
	 * Computes the arguments of the generator.
	 * 
	 * @return the arguments
	 * @generated
	 */
	protected List<? extends Object> getArguments() {
		return new ArrayList<String>();
	}

}