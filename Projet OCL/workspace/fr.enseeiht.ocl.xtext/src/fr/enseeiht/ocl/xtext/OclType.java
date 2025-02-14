package fr.enseeiht.ocl.xtext;

public interface OclType {
	
	/** Fonction de conformité de type utilisée pour vérifier le typage des expressions.
	 * @param oclType : le type avec lequel l'objet se conforme ou non
	 * @return true si le type de l'objet se conforme au type oclType
	 */
	public boolean conformsTo(OclType oclType);
	
	/** Fonction d'unification de types, utilisée pour déduire le type de certaines expressions (comme 1 + 1.0).
	 * @param oclType : le type avec lequel l'objet doit s'unifier
	 * @return le plus petit type (pour la relation de conformité) auquel le type de l'objet et oclType se conforment.
	 */
	public OclType unifyWith(OclType oclType);
	
}
