
package ocl;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import petrinet.Net;
import petrinet.NetElement;
import petrinet.Arc;
import petrinet.Place;
import petrinet.Transition;
import petrinet.Bloc;

import petrinet.util.PetrinetSwitch;

/**
 * Réalise la validation d'un EObject issu de Petrinet.
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
public class PetrinetValidator extends PetrinetSwitch<Boolean> {

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
	public PetrinetValidator() {}

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
		 * Méthode appelée lorsque l'objet visité est un Net.
		 * Cet méthode amorce aussi la visite des éléments enfants.
		 * Si l'EOject n'était pas déjà visité on le viste sinon on poursuit la visite.
		 * @param object élément visité
		 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
		 * vers les classes parentes, le cas échéant)
		 */
		@Override
		public Boolean caseNet(petrinet.Net object) {

			if(!eObject.contains(object)) {
				eObject.add(object);
				this.ocl.check(object);
	
				for (NetElement pe : object.getNetElements()) {
					if(!eObject.contains(pe)) {
						this.doSwitch(pe);
					}
				}
			
	
			}
	
			return null;
		}
	
	
		/**
		 * Méthode appelée lorsque l'objet visité est un NetElement.
		 * Cet méthode amorce aussi la visite des éléments enfants.
		 * Si l'EOject n'était pas déjà visité on le viste sinon on poursuit la visite.
		 * @param object élément visité
		 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
		 * vers les classes parentes, le cas échéant)
		 */
		@Override
		public Boolean caseNetElement(petrinet.NetElement object) {

			if(!eObject.contains(object)) {
				eObject.add(object);
				this.ocl.check(object);
	
				if(!eObject.contains(object.getNet())) {
					this.doSwitch(object.getNet());
				}
			
	
			}
	
			return null;
		}
	
	
		/**
		 * Méthode appelée lorsque l'objet visité est un Arc.
		 * Cet méthode amorce aussi la visite des éléments enfants.
		 * Si l'EOject n'était pas déjà visité on le viste sinon on poursuit la visite.
		 * @param object élément visité
		 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
		 * vers les classes parentes, le cas échéant)
		 */
		@Override
		public Boolean caseArc(petrinet.Arc object) {

			if(!eObject.contains(object)) {
				eObject.add(object);
				this.ocl.check(object);
	
				if(!eObject.contains(object.getNet())) {
					this.doSwitch(object.getNet());
				}
			
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
		 * Méthode appelée lorsque l'objet visité est un Place.
		 * Cet méthode amorce aussi la visite des éléments enfants.
		 * Si l'EOject n'était pas déjà visité on le viste sinon on poursuit la visite.
		 * @param object élément visité
		 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
		 * vers les classes parentes, le cas échéant)
		 */
		@Override
		public Boolean casePlace(petrinet.Place object) {

			if(!eObject.contains(object)) {
				eObject.add(object);
				this.ocl.check(object);
	
				if(!eObject.contains(object.getNet())) {
					this.doSwitch(object.getNet());
				}
			
				for (Arc pe : object.getLinksToPredecessor()) {
					if(!eObject.contains(pe)) {
						this.doSwitch(pe);
					}
				}
			
				for (Arc pe : object.getLinksToSuccessor()) {
					if(!eObject.contains(pe)) {
						this.doSwitch(pe);
					}
				}
			
	
			}
	
			return null;
		}
	
	
		/**
		 * Méthode appelée lorsque l'objet visité est un Transition.
		 * Cet méthode amorce aussi la visite des éléments enfants.
		 * Si l'EOject n'était pas déjà visité on le viste sinon on poursuit la visite.
		 * @param object élément visité
		 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
		 * vers les classes parentes, le cas échéant)
		 */
		@Override
		public Boolean caseTransition(petrinet.Transition object) {

			if(!eObject.contains(object)) {
				eObject.add(object);
				this.ocl.check(object);
	
				if(!eObject.contains(object.getNet())) {
					this.doSwitch(object.getNet());
				}
			
				for (Arc pe : object.getLinksToPredecessor()) {
					if(!eObject.contains(pe)) {
						this.doSwitch(pe);
					}
				}
			
				for (Arc pe : object.getLinksToSuccessor()) {
					if(!eObject.contains(pe)) {
						this.doSwitch(pe);
					}
				}
			
	
			}
	
			return null;
		}
	
	
		/**
		 * Méthode appelée lorsque l'objet visité est un Bloc.
		 * Cet méthode amorce aussi la visite des éléments enfants.
		 * Si l'EOject n'était pas déjà visité on le viste sinon on poursuit la visite.
		 * @param object élément visité
		 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
		 * vers les classes parentes, le cas échéant)
		 */
		@Override
		public Boolean caseBloc(petrinet.Bloc object) {

			if(!eObject.contains(object)) {
				eObject.add(object);
				this.ocl.check(object);
	
				if(!eObject.contains(object.getNet())) {
					this.doSwitch(object.getNet());
				}
			
				for (Arc pe : object.getLinksToPredecessor()) {
					if(!eObject.contains(pe)) {
						this.doSwitch(pe);
					}
				}
			
				for (Arc pe : object.getLinksToSuccessor()) {
					if(!eObject.contains(pe)) {
						this.doSwitch(pe);
					}
				}
			
	
			}
	
			return null;
		}
	

	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}

}

