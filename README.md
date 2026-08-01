# Design Patterns 🎨

Implémentation de 5 design patterns courants, en Python et en Java, avec explication du problème que chacun résout et un schéma simplifié.

## Patterns implémentés

### 1. Singleton
**Problème résolu** : garantir qu'une classe n'a qu'une seule instance dans toute l'application, avec un point d'accès global.

**Quand ne PAS l'utiliser** : si l'état partagé global rend les tests unitaires difficiles, ou si l'application a besoin de plusieurs configurations en parallèle (ex: multi-tenant).

Schéma :
[Client] ---> getInstance() ---> [Instance unique]
[Client] ---> getInstance() ---> (même instance)

- Python : `python/singleton.py`
- Java : `java/Singleton.java`

### 2. Factory
**Problème résolu** : centraliser la création d'objets similaires selon un critère, sans exposer la logique de création au code appelant.

**Quand ne PAS l'utiliser** : si on a un seul type d'objet à créer — ajoute de la complexité inutile pour rien.

Schéma :
[Client] ---> Factory.creer("email") ---> [NotificationEmail]
[Client] ---> Factory.creer("sms")   ---> [NotificationSMS]

- Python : `python/factory.py`
- Java : `java/Factory.java`

### 3. Observer
**Problème résolu** : permettre à un objet de notifier automatiquement plusieurs autres objets lors d'un changement d'état.

**Quand ne PAS l'utiliser** : si l'ordre de notification des observateurs est critique, ou si trop d'observateurs créent des effets en cascade difficiles à suivre.

Schéma :
[Sujet] --notifie--> [ObservateurEmail]
[Sujet] --notifie--> [ObservateurLog]

- Python : `python/observer.py`
- Java : `java/Observer.java`

### 4. Strategy
**Problème résolu** : changer un algorithme à la volée, en encapsulant chaque variante dans sa propre classe interchangeable.

**Quand ne PAS l'utiliser** : si les algorithmes sont très simples (un `if/else` suffirait), le pattern ajoute de la complexité disproportionnée.

Schéma :
[Panier] ---> strategie.payer() ---> [PaiementCarte] ou [PaiementPaypal]

- Python : `python/strategy.py`
- Java : `java/Strategy.java`

### 5. MVC
**Problème résolu** : séparer les données (Model), l'affichage (View) et la logique de coordination (Controller).

**Quand ne PAS l'utiliser** : pour de très petits scripts où la séparation ajoute plus de fichiers que de valeur.

Schéma :
[Controller] ---> lit/modifie ---> [Model]
[Controller] ---> déclenche ---> [View] ---> affiche

- Python : `python/mvc.py`
- Java : `java/MVC.java`

## Comment exécuter

### Python

python python/singleton.py
python python/factory.py
python python/observer.py
python python/strategy.py
python python/mvc.py

### Java

javac java/Singleton.java && java -cp java Singleton
javac java/Factory.java && java -cp java Factory
javac java/Observer.java && java -cp java Observer
javac java/Strategy.java && java -cp java Strategy
javac java/MVC.java && java -cp java MVC

## Méthodologie
Chaque pattern a été développé sur sa propre branche, puis fusionné dans `main` via une Pull Request après vérification du bon fonctionnement dans les deux langages.

## Technologies utilisées
- Python 3
- Java (JDK 26)