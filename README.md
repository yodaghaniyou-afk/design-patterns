# Design Patterns 🎨

Implémentation de 3 design patterns courants, en Python et en Java, avec explication du problème que chacun résout.

## Patterns implémentés

### 1. Singleton
**Problème résolu** : garantir qu'une classe n'a qu'une seule instance dans toute l'application, avec un point d'accès global — utile pour éviter les incohérences (ex: configuration partagée, connexion unique à une ressource).

- Python : `python/singleton.py`
- Java : `java/Singleton.java`

### 2. Factory
**Problème résolu** : centraliser la création d'objets similaires selon un critère, sans exposer la logique de création au code appelant — facilite l'ajout de nouveaux types sans modifier le code existant.

- Python : `python/factory.py`
- Java : `java/Factory.java`

### 3. Observer
**Problème résolu** : permettre à un objet de notifier automatiquement plusieurs autres objets lors d'un changement d'état, sans couplage fort entre eux — utile pour les systèmes d'événements et notifications.

- Python : `python/observer.py`
- Java : `java/Observer.java`

## Comment exécuter

### Python
```bash
python python/singleton.py
python python/factory.py
python python/observer.py
```

### Java
```bash
javac java/Singleton.java
java -cp java Singleton

javac java/Factory.java
java -cp java Factory

javac java/Observer.java
java -cp java Observer
```

## Méthodologie
Chaque pattern a été développé sur sa propre branche (`feature-singleton`, `feature-factory`, `feature-observer`), puis fusionné dans `main` via une Pull Request.

## Technologies utilisées
- Python 3
- Java (JDK 26)