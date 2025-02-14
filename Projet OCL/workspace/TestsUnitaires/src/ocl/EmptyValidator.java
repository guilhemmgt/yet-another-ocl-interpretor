
package ocl;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import empty.Liar;
import empty.Maybe;
import empty.SubLiar;

import empty.util.EmptySwitch;

/**
 * Réalise la validation d'un EObject issu de Empty.
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
public class EmptyValidator extends EmptySwitch<Boolean> {

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
	public EmptyValidator() {}

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
		 * Méthode appelée lorsque l'objet visité est un Liar.
		 * Cet méthode amorce aussi la visite des éléments enfants.
		 * Si l'EOject n'était pas déjà visité on le viste sinon on poursuit la visite.
		 * @param object élément visité
		 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
		 * vers les classes parentes, le cas échéant)
		 */
		@Override
		public Boolean caseLiar(empty.Liar object) {

			if(!eObject.contains(object)) {
				eObject.add(object);
				this.ocl.check(object);
	
				for (Maybe pe : object.getMaybe()) {
					if(!eObject.contains(pe)) {
						this.doSwitch(pe);
					}
				}
			
				for (SubLiar pe : object.getSubLiar()) {
					if(!eObject.contains(pe)) {
						this.doSwitch(pe);
					}
				}
			
	
			}
	
			return null;
		}
	
	
		/**
		 * Méthode appelée lorsque l'objet visité est un Maybe.
		 * Cet méthode amorce aussi la visite des éléments enfants.
		 * Si l'EOject n'était pas déjà visité on le viste sinon on poursuit la visite.
		 * @param object élément visité
		 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
		 * vers les classes parentes, le cas échéant)
		 */
		@Override
		public Boolean caseMaybe(empty.Maybe object) {

			if(!eObject.contains(object)) {
				eObject.add(object);
				this.ocl.check(object);
	
				if(!eObject.contains(object.getSubLiar())) {
					this.doSwitch(object.getSubLiar());
				}
			
	
			}
	
			return null;
		}
	
	
		/**
		 * Méthode appelée lorsque l'objet visité est un SubLiar.
		 * Cet méthode amorce aussi la visite des éléments enfants.
		 * Si l'EOject n'était pas déjà visité on le viste sinon on poursuit la visite.
		 * @param object élément visité
		 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
		 * vers les classes parentes, le cas échéant)
		 */
		@Override
		public Boolean caseSubLiar(empty.SubLiar object) {

			if(!eObject.contains(object)) {
				eObject.add(object);
				this.ocl.check(object);
	
				for (Maybe pe : object.getMaybe()) {
					if(!eObject.contains(pe)) {
						this.doSwitch(pe);
					}
				}
			
				for (SubLiar pe : object.getSubLiar()) {
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

