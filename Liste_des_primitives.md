# Liste des primitives et de leurs opération.

Ce document résume l'entièreté des primitives de base, des collections et de leurs opérations prévues pour cette version d'OCL. Au vu de la grande quantité d'opérations possibles, seule une partie de cette liste jugée plus importante sera réalisée.

## Primitives de base

Voici un résumé de la hiérarchie des types :

### __OclAny__

Super type des tous les autres types. comparable à Object en Java.

- =, <>
- oclAsSet()
- oclIsUndefined()
- oclAsType()
- oclIsTypeOf(type), oclIsKindOf(type)
- oclType()

### __oclVoid__

Le type dont la seule valeur est *null*. Ne pas confondre avec oclInvalid

- =, <>
- oclAsSet()
- oclIsUndefined()
- oclAsType()
- oclIsTypeOf(type), oclIsKindOf(type)
- oclType()

### __oclInvalid__

Le type dont la seule valeur est *invalid*. Ne pas confondre avec oclVoid

- =, <>
- oclAsSet()
- oclIsUndefined()
- oclAsType()
- oclIsTypeOf(type), oclIsKindOf(type)
- oclType()

### __Reals__

Le type qui représente les nombres réels.

- +, -, \*, - (unaire), /
- abs()
- floor(), round()
- max(real), min(real)
- <, >, <=, >=
- toString()

### __Integers__

Le type qui représente les entiers. Se conforme à **Reals**. L'absence d'inégalité est normale car hérité des réels (le type de retour reste un booléen).

- +, -, \*, - (unaire), /
- abs()
- div(integer)
- mod(integer)
- max(integer), min(integer)
- toString()

### __String__

Représente les chaines de caractères.

- +, concat(string)
- substrig(lower, upper)
- toInteger(), toReal(), toBoolean()
- toUpperCase(), toLowerCase()
- indexOf(string), at(index)
- equalsIgnoreCase(string)
- characters()
- <, >, <=, >= (Qui sera ignoré dans cette version)

### __Boolean__

Représente les valeurs *true* et *false*.

- or, xor, and, not, implies(boolean)
- toString()

### __UnlimitedNatural__

Représente les entiers positifs ou nuls non bornés. Se conforme aux **Integers** et ajoute une valeur \* qui renvoie *invalid*. Par exemple, on a :
    1 + \* = *invalid*
Nécessaire pour traiter les multiplicités de la forme "n..\*". \* représente donc l'entier "infini".

- +, -, \*, - (unaire), /
- abs(nat)
- div(nat)
- mod(nat)
- max(nat), min(nat)
- <, >, <=, >=
- toInteger()
- toString()

## Collections

Cette section est réservée aux collections et à leurs opérations de base. Les itérateurs seront couverts dans la section suivante. Il est important de noter qu'un grand nombre d'opération se répète.

### __Collection__

Super type abstrait de toutes les collections suivantes. Définit un grand nombre d'opérations qui seront réutilisées par ses sous-ypes. Un certain nombre de ces opérations seront cependant redéfinies dans ces sous-types pour ajouter des pré/postconditions ou type de retour plus spécialisé.

- =, <>,
- size()
- includes(object), excludes(object)
- includesAll(collection2), excludesAll(collection2)
- count(object)
- isEmpty(), notEmpty()
- max(), min(), sum() (si le type des éléments de la collection le permet)
- product(collection2) (produit cartésien)
- selectByKind(type), selectByType(type)
- asSet(), asOrderedSet(), asSequence(), asBag()
- flatten()

### __Set__

L'ensemble au niveau mathématique, sans doublon ni ordre particulier.

- =
- union(set), union(bag), intersection(set), intersection(bag)
- - (set1 - set2 = set1 excluding all elements of set2)
- including(object), excluding(object)
- symmetricDifference(set)
- count(object)
- selectByKind(type), selectByType(type)
- asSet(), asOrderedSet(), asSequence(), asBag()
- flatten()

### __OrderedSet__

Un ensemble sans doublon mais ordonné.

- append(object), prepend(object)
- insertAt(index, object)
- subOrderedSet(lower, upper), at(index), indexOf(object)
- first(), last(), reverse()
- sum() (si le type des éléments de l'ensemble le permet)
- selectByKind(type), selectByType(type)
- asSet(), asOrderedSet(), asSequence(), asBag()

### __Bag__

Représente une collection d'objets non ordonnés mais avec présence de doublons.

- =
- union(set), union(bag), intersection(set), intersection(bag)
- including(object), excluding(object)
- count(object)
- selectByKind(type), selectByType(type)
- asSet(), asOrderedSet(), asSequence(), asBag()
- flatten()

### __Sequence__

Comme **Bag**, il s'agit d'une collection avec possibilité de doublons, mais cette fois ordonnée.

- count()
- =
- union(sequence)
- append(object), prepend(object)
- insertAt(index, object)
- subSequence(lower, upper), at(index), indexOf(object)
- first(), last(), reverse()
- including(object), excluding(object)
- sum() (si le type des éléments de l'ensemble le permet)
- selectByKind(type), selectByType(type)
- asSet(), asOrderedSet(), asSequence(), asBag()

## Iterators

Cette section est dédiée aux itérateurs sur les collections qui doivent être ajoutées à cette version d'OCL. Puisque la majorité d'entre elles sont relativement complexes, elles seront ajoutées quand le reste du projet sera fonctionnel. Il est vivement conseillé de faire attention à quelle itération se repose sur une autre, pour ne pas faire de travail inutile. En cas de doute, consulter la page 193 de la spécification officielle de OCL.
Les arguments seront ignorés car tous de la forme *collection.opération(itérateur | corps)*

### __Collections__

Comme pour les opérations de base, seulement 4 de ces itérateurs seront redéfinis dans les sous-types pour des raisons de changement de type de retour ou de pre/postcondition.

- any
- closure
- collectNested, collect (le deuxième se base sur le premier)
- exists, forAll
- isUnique
- one
- reject, select
- sortedBy

### __Set, Bag, Sequence, OrderedSet__

- select, reject
- collectNested
- sortedBy

## Remarques

Deux types ont été exclus jusqu'ici de la liste : les **Tuple** et les **Enumeration**. Je n'ai trouvé d'opération spéciale ou d'itération (les **Enumeration** n'étant pas des **Collection**). Ces types pourront être ajoutés plus tard sans grande conséquence.
