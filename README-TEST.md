# Comment tester votre code ?

## Lancement des tests

Pour lancer vos tests, rien de plus simple, il vous suffit de lancer la classe `fr.enseeiht.ocl.testsLauncher.TestSuite` du projet `fr.enseeiht.ocl.testsLauncher` (après l'avoir importé) avec JUnit 5, cela lancera une vue arborescente avec tout les tests.

Si vous souhaitez lancer un test précis (pour éviter de relancer tout les tests), vous pouvez a partir de cette vue arborescente, faire un click droit "Run", ce qui lancera uniquement ce test.

## Ecriture des tests

Les tests venant des projets IDM de l'année dernière ne sont pas à être modifiés, vous n'avez donc pas à importer leurs projets.

Cependant, vous pouvez (et devez) créer des tests unitaires, pour cela : 
- Importez le projet `TestsUnitaires`
- Chaque test est, par défaut, lancé sur les fichiers `Empty.ecore` et `Liar.xmi`, ces fichiers sont normalement suffisamment complets pour pouvoir tester toutes les features d'*OCL*. Cependant, si vous voyez quelque chose qui manque, n’hésitez pas à le rajouter vous-même. 
- Les tests se trouvent dans le dossier `tests`, dans ce dossier vous pouvez créer un fichier de test, quelque soit le sous-dossier dans lequel il est (je parcours tout les sous-dossiers quelque soit leur nom, ainsi n’hésitez pas a les ranger comme vous le souhaitez). Le fichier doit suivre une structure particulière décrite dans la section [Structure des fichiers de tests](#structure-des-fichiers-de-tests).

### Structure des fichiers de tests
Les fichiers de tests doit suivre une structure particulière :
- son nom doit être sous ce format : `<préfixe>-<nom du test>.mocl`. Les préfixes sont au nombre de 4, spécifiant à quel moment le test doit échouer (s'il doit échouer) :
	- `s` : syntaxe incorrecte
	- `t` : syntaxe correcte mais typage invalide
	- `v` : compilation réussie mais erreurs de validation
	- `ok` : tout passe
- le nom du test ne doit donc pas avoir de `-`, et la convention est d'utiliser le *Camel case*
- il est possible de rajouter des informations supplémentaires : 
	- si le fichier est préfixé de `s` ou `t`, alors il est possible de rajouter le message d'erreur attendu, pour cela il vous faut rajouter un commentaire dans votre fichier mocl avec la balise `@error`. ex :
 
		 ```ada
		 -- @error : "required (...)+ loop did not match anything at input '<EOF>'"
   		 
		 import "http://empty" as empty
		 ```

	- si le fichier est préfixé de `v` ou `ok`, que vous considérez que les `ecore` et `xmi` utilisés par défaut ne sont pas suffisamment complets et que vous ne voulez pas les modifier parce que vous pensez que vous casserez quelque chose, il est possible de lier votre test à un autre `ecore` et `xmi` que vous venez d'écrire, pour cela :
		- créez vos fichiers à la racine du projet.
		- écrivez les noms de ces fichiers dans le nom du test de cette manière : `<préfixe>;<nom du Ecore sans le ".ecore">;<nom du XMI sans le ".xmi">-<nom du test>.mocl`
	- si le fichier est préfixé de `v`, alors le fichier ne doit contenir qu'un seul invariant qui sera alors validé ou non. 
