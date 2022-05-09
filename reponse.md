# 1.1
@override est un décorateur permettant de surcharger une méthode.
Override n'est pas obligatoire ici.

# 1.2
public ne devrait pas être utilisé afin d'éviter de donner un accès facile aux attributs.
Il est préférable d'utiliser l'attribut private et de déclarer ensuite des getters et setters afin d'avoir un controle sur l'accès.
Par exemple pour éviter de définir une valeur que l'on ne souhaiterais pas voir sur un attribut.

# 1.3

écrire c1.equals(c2) est possible mais retournera false.
Il faut redéfinir la méthode equals pour qu'elle compare correctement les attributs.

## Exercice 2

# 2.1
Voir fichier CLITest.java


# 2.2
alpha=0.85, epsilon=0.001, indice=100, mode=CREUSE

# 2.3
L'erreur nous apprend que lorsque le programme a essayé de convertir une chaine de caractère en Int, il y a eu une erreur durant la conversion.
En effet nous essayons de convertir une chaine de caractère qui correspond plutot à un Double.
Cette erreur survient dans le fichier CLIClassique ligne 11.

# 2.4
On peut déduire cette erreur car nous savons que l'option -K 15.5 correspond plus pour un Double que pour un Int, donc lorsque le code va être éxécuté il y aura une erreur de conversion

# 2.5
Voir CLIClassique.java

# 2.6

## Exercice 3

# 3.1
# 3.2
# 3.3
Hashmap -> clé -> valeur

## Exercice 4

# 4.1
Il nous faut un jframe
Ce jframe contiendra 3 jpanel
le premier jpanel sera en 

# 4.2
Il faut rajouter un actionListener sur le bouton pour réagir aux évènements sur ce bouton.
Si un évènement se produit on utilise la méthode actionPerformed pour lancer une fonction qui changera le texte du textField prévu


# 4.3
voir code CLIUserInterface

## Exercice 5

# 5.1
Voir CLIOutils.java

#  5.2
On pourrait rajouter une méthode pour récupérer toute les options dans la classe CLI et rajouter une méthode addAction dans la classe Option.

## Exercice 6
<!ELEMENT cli (argument+)>
    <!ELEMENT argument (#PCDATA)>
    <!ATTLIST argument
        acces CDATA #REQUIRED
        nb CDATA #IMPLIED>