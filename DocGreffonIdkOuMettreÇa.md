# Utilisateur

Pour faire fonctionner le plugin :
- Avoir un projet avec un .ecore
- Ouvrir un .xmi instance du .ecore avec le Sample Reflexive Editor
- Cliquer droit sur le .xmi ou un de ces élements
- Ajouter le .mocl via "Load Resource" ou "MOCL -> Load"
- Validez le .mocl via "MOCL -> Validate"
- Profit.

# Développeur

Structure de l'ui (projet fr.enseeiht.yaoi.ui) :
- fr.enseeiht.yaoi.ui.handlers : handlers pour les actions de l'ui (Load, Validate)
- fr.enseeiht.yaoi.ui.testers : testeurs pour où afficher les actions
- fr.enseeiht.yaoi.ui/plugin.xml : déclaration des extensions
	- Déclaration des handlers
	- Déclaration du menu : 
		- ne s'affiche que pour l'éditeur Reflexif xmi (utiliser le Plugin Spy Tool pour trouver l'uri d'un editeur
		- ne s'affiche seulement si une seule entrée est sélectionnée
		- utiliser fr.enseeiht.yaoi.ui.testers.IsEcore pour tester si l'entrée est bel et bien un .xmi ou un de ses enfants

