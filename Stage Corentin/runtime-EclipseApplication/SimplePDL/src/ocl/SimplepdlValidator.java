
package ocl;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import simplepdl.Process;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.Guidance;
import simplepdl.ProcessElement;
import simplepdl.Resource;
import simplepdl.ResourceNeeded;

import simplepdl.util.SimplepdlSwitch;

/**
 * Réalise la validation d'un EObject issu de Simplepdl.
 * Cet classe visite le modèle et utilise les caseXXX pour rediriger l'algo vers la
 * bonne méthode.
 * 
 * La classe Switch exige un paramètre de généricité (et gère une partie de la visite à
 * base de comparaison à null). Ici le paramètre est un booléen mais en réalité on ne
 * s'en sert pas...
 * 
 * @author Corentin THOISON basé sur le code de Guillaume DUPONT
 * @version 0.1
 */
public class SimplepdlValidator extends SimplepdlSwitch<Boolean> {

	/**
	 * On enregistre tous les objects accessible pour certaines fonctions OCL.
	 */
	ArrayList<EObject> allObjects = new ArrayList<EObject>();

	/**
	 * On enregistre les EObjects déjà visités pour éviter d'avoir une boucle infinie.
	 */
	ArrayList<EObject> eObject = new ArrayList<EObject>();

	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * On récupère OCL où sont stockées les conditions.
	 */
	private OCL ocl;

	/**
	 * Construire un validateur
	 */
	public SimplepdlValidator() {}

	/**
	 * Lancer la validation et compiler les résultats dans un ValidationResult.
	 * Cette méthode se charge de créer un résultat de validation vide puis de
	 *  visiter les process présents dans la ressource.
	 * @param resource resource à valider
	 * @return résultat de validation
	 */
	public ValidationResult validate(org.eclipse.emf.ecore.resource.Resource resource) {
		this.result = new ValidationResult();
		eObject.add(null);

		EList<EObject> r = resource.getContents();

		for (EObject object : r) {
			this.allObjects.add(object);
			TreeIterator<EObject> iterator = EcoreUtil.getAllContents(object, true);
			while (iterator.hasNext()) {
				EObject obj = iterator.next();
				this.allObjects.add(obj);
			}
		}

		this.ocl = new OCL(this.result, this.allObjects);

		for (EObject object : r) {
			this.doSwitch(object);
		}

		return this.result;
	}

	
		/**
		 * Méthode appelée lorsque l'objet visité est un Process.
		 * Cet méthode amorce aussi la visite des éléments enfants.
		 * Si l'EOject n'était pas déjà visité on le viste sinon on poursuit la visite.
		 * @param object élément visité
		 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
		 * vers les classes parentes, le cas échéant)
		 */
		@Override
		public Boolean caseProcess(simplepdl.Process object) {

			if(!eObject.contains(object)) {
				eObject.add(object);
				this.ocl.check(object);
	
				for (ProcessElement pe : object.getProcessElements()) {
					if(!eObject.contains(pe)) {
						this.doSwitch(pe);
					}
				}
			
	
			}
	
			return null;
		}
	
	
		/**
		 * Méthode appelée lorsque l'objet visité est un WorkDefinition.
		 * Cet méthode amorce aussi la visite des éléments enfants.
		 * Si l'EOject n'était pas déjà visité on le viste sinon on poursuit la visite.
		 * @param object élément visité
		 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
		 * vers les classes parentes, le cas échéant)
		 */
		@Override
		public Boolean caseWorkDefinition(simplepdl.WorkDefinition object) {

			if(!eObject.contains(object)) {
				eObject.add(object);
				this.ocl.check(object);
	
				for (WorkSequence pe : object.getLinksToPredecessors()) {
					if(!eObject.contains(pe)) {
						this.doSwitch(pe);
					}
				}
			
				for (WorkSequence pe : object.getLinksToSuccessors()) {
					if(!eObject.contains(pe)) {
						this.doSwitch(pe);
					}
				}
			
				for (ResourceNeeded pe : object.getNeed()) {
					if(!eObject.contains(pe)) {
						this.doSwitch(pe);
					}
				}
			
	
			}
	
			return null;
		}
	
	
		/**
		 * Méthode appelée lorsque l'objet visité est un WorkSequence.
		 * Cet méthode amorce aussi la visite des éléments enfants.
		 * Si l'EOject n'était pas déjà visité on le viste sinon on poursuit la visite.
		 * @param object élément visité
		 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
		 * vers les classes parentes, le cas échéant)
		 */
		@Override
		public Boolean caseWorkSequence(simplepdl.WorkSequence object) {

			if(!eObject.contains(object)) {
				eObject.add(object);
				this.ocl.check(object);
	
				if(!eObject.contains(object.getPredecessor())) {
					this.doSwitch(object.getPredecessor());
				}
			
				if(!eObject.contains(object.getSuccessor())) {
					this.doSwitch(object.getSuccessor());
				}
			
	
			}
	
			return null;
		}
	
	
		/**
		 * Méthode appelée lorsque l'objet visité est un Guidance.
		 * Cet méthode amorce aussi la visite des éléments enfants.
		 * Si l'EOject n'était pas déjà visité on le viste sinon on poursuit la visite.
		 * @param object élément visité
		 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
		 * vers les classes parentes, le cas échéant)
		 */
		@Override
		public Boolean caseGuidance(simplepdl.Guidance object) {

			if(!eObject.contains(object)) {
				eObject.add(object);
				this.ocl.check(object);
	
				for (ProcessElement pe : object.getElements()) {
					if(!eObject.contains(pe)) {
						this.doSwitch(pe);
					}
				}
			
	
			}
	
			return null;
		}
	
	
		/**
		 * Méthode appelée lorsque l'objet visité est un ProcessElement.
		 * Cet méthode amorce aussi la visite des éléments enfants.
		 * Si l'EOject n'était pas déjà visité on le viste sinon on poursuit la visite.
		 * @param object élément visité
		 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
		 * vers les classes parentes, le cas échéant)
		 */
		@Override
		public Boolean caseProcessElement(simplepdl.ProcessElement object) {

			if(!eObject.contains(object)) {
				eObject.add(object);
				this.ocl.check(object);
	
	
			}
	
			return null;
		}
	
	
		/**
		 * Méthode appelée lorsque l'objet visité est un Resource.
		 * Cet méthode amorce aussi la visite des éléments enfants.
		 * Si l'EOject n'était pas déjà visité on le viste sinon on poursuit la visite.
		 * @param object élément visité
		 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
		 * vers les classes parentes, le cas échéant)
		 */
		@Override
		public Boolean caseResource(simplepdl.Resource object) {

			if(!eObject.contains(object)) {
				eObject.add(object);
				this.ocl.check(object);
	
	
			}
	
			return null;
		}
	
	
		/**
		 * Méthode appelée lorsque l'objet visité est un ResourceNeeded.
		 * Cet méthode amorce aussi la visite des éléments enfants.
		 * Si l'EOject n'était pas déjà visité on le viste sinon on poursuit la visite.
		 * @param object élément visité
		 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
		 * vers les classes parentes, le cas échéant)
		 */
		@Override
		public Boolean caseResourceNeeded(simplepdl.ResourceNeeded object) {

			if(!eObject.contains(object)) {
				eObject.add(object);
				this.ocl.check(object);
	
				if(!eObject.contains(object.getLinkToWD())) {
					this.doSwitch(object.getLinkToWD());
				}
			
				if(!eObject.contains(object.getTakes())) {
					this.doSwitch(object.getTakes());
				}
			
	
			}
	
			return null;
		}
	

	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}

}

