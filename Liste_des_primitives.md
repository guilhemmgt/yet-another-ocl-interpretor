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

## __oclVoid__

Le type dont la seule valeur est *null*. Ne pas confondre avec oclInvalid

- =, <>
- oclAsSet()
- oclIsUndefined()
- oclAsType()
- oclIsTypeOf(type), oclIsKindOf(type)
- oclType()

## __oclInvalid__

Le type dont la seule valeur est *invalid*. Ne pas confondre avec oclVoid

- =, <>
- oclAsSet()
- oclIsUndefined()
- oclAsType()
- oclIsTypeOf(type), oclIsKindOf(type)
- oclType()

## __Reals__

Le type qui représente les nombres réels.

- +, -, \*, - (unaire), /
- abs()
- floor(), round()
- max(real), min(real)
- <, >, <=, >=
- toString()

## __Integers__

Le type qui représente les entiers. Se conforme à **Reals**. L'absence d'inégalité est normale car hérité des réels (le type de retour reste un booléen).

- +, -, \*, - (unaire), /
- abs()
- div(integer)
- mod(integer)
- max(integer), min(integer)
- toString()

## __String__

Représente les chaines de caractères.

- +, concat(string)
- substrig(lower, upper)
- toInteger(), toReal(), toBoolean()
- toUpperCase(), toLowerCase()
- indexOf(string), at(index)
- equalsIgnoreCase(string)
- characters()
- <, >, <=, >= (Qui sera ignoré dans cette version)

## __Boolean__

Représente les valeurs *true* et *false*.

- or, xor, and, not, implies(boolean)
- toString()

## __UnlimitedNatural

Représente les entiers positifs ou nuls non bornés. Se conforme aux **Integers** et ajoute une valeur \* qui renvoie *invalid*. Par exemple, on a :
    1 + \* = *invalid*
Nécessaire pour traiter les multiplicités de la forme "n//\*". \* représente donc l'entier "infini".

- +, -, \*, - (unaire), /
- abs(nat)
- div(nat)
- mod(nat)
- max(nat), min(nat)
- <, >, <=, >=
- toInteger()
- toString()
