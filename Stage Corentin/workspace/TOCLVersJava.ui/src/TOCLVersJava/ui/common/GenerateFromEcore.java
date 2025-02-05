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
package TOCLVersJava.ui.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;


/**
 * Main entry point of the 'TOCL' generation module.
 */
public class GenerateFromEcore {

	/**
	 * The model URI.
	 */
	private URI modelURI;

	/**
	 * The output folder.
	 */
	private IContainer targetFolder;

	/**
	 * The other arguments.
	 */
	List<? extends Object> arguments;

	/**
	 * Constructor.
	 * 
	 * @param modelURI
	 *            is the URI of the model.
	 * @param targetFolder
	 *            is the output folder
	 * @param arguments
	 *            are the other arguments
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generated
	 */
	public GenerateFromEcore(URI modelURI, IContainer targetFolder, List<? extends Object> arguments) {
		this.modelURI = modelURI;
		this.targetFolder = targetFolder;
		this.arguments = arguments;
	}

	/**
	 * Launches the generation.
	 *
	 * @param monitor
	 *            This will be used to display progress information to the user.
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generated
	 */
	public void doGenerate(IProgressMonitor monitor) throws IOException {
		if (!targetFolder.getLocation().toFile().exists()) {
			targetFolder.getLocation().toFile().mkdirs();
		}
		
		IContainer oclTargetFolder = targetFolder.getFolder(new Path("ocl"));
		if (!oclTargetFolder.getLocation().toFile().exists()) {
			oclTargetFolder.getLocation().toFile().mkdirs();
		}
		
		monitor.subTask("Loading...");
		ECoreToJava.main.ToJava gen0 = new ECoreToJava.main.ToJava(modelURI, oclTargetFolder.getLocation().toFile(), arguments);
		monitor.worked(1);
		String generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("ECoreToJava", "ECoreToJava.main.ToJava", modelURI.toString(), oclTargetFolder.getFullPath().toString(), new ArrayList<String>());
		gen0.setGenerationID(generationID);
		gen0.doGenerate(BasicMonitor.toMonitor(monitor));
			
		EObject model = gen0.getModel();
		if (model != null) {
			
			IContainer oclCollectionTargetFolder = targetFolder.getFolder(new Path("oclCollections"));
			if (!oclCollectionTargetFolder.getLocation().toFile().exists()) {
				oclCollectionTargetFolder.getLocation().toFile().mkdirs();
			}
			
			monitor.subTask("Loading...");
			OCLCollectionToJava.main.OclCollectionToJava gen1 = new OCLCollectionToJava.main.OclCollectionToJava(model, oclCollectionTargetFolder.getLocation().toFile(), arguments);
			monitor.worked(1);
			generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("OCLCollectionToJava", "OCLCollectionToJava.main.OclCollectionToJava", modelURI.toString(), oclTargetFolder.getFullPath().toString(), new ArrayList<String>());
			gen1.setGenerationID(generationID);
			gen1.doGenerate(BasicMonitor.toMonitor(monitor));
		}
		
	}

}
