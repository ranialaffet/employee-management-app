# employee-management-app

Ce dépôt contient une application Spring Boot de gestion des employés, refactorisée pour séparer les responsabilités du back-office et du front-office en deux microservices distincts : `employees-core` et `employees-web`.

## Objectifs de la Refactorisation

L'application initiale mélangeait les responsabilités du back-office et du front-office, ce qui rendait le code difficile à maintenir et à faire évoluer. L'objectif de cette refactorisation était de :

* **Séparer les préoccupations :**
    * Créer un microservice `employees-core` dédié à la logique métier et à l'accès aux données.
    * Créer un microservice `employees-web` dédié à l'interface utilisateur et à la présentation des données.
* **Améliorer la maintenabilité :**
    * Rendre le code plus modulaire et plus facile à comprendre.
    * Faciliter les tests et les déploiements indépendants des microservices.
* **Favoriser la réutilisation :**
    * Permettre à d'autres applications d'utiliser le microservice `employees-core` via son interface `IEmployeService`.

## Architecture

* **employees-core :**
    * Contient les classes métiers (entités, services, repositories) pour la gestion des employés.
    * Expose une interface `IEmployeService` pour interagir avec les données des employés.
* **employees-web :**
    * Contient les contrôleurs et les vues Thymeleaf pour l'affichage des pages web.
    * Utilise l'interface `IEmployeService` pour accéder aux données des employés.

## Fonctionnalités

* Affichage de la liste des employés.
* Ajout de nouveaux employés via un formulaire.
* Visualisation des détails de chaque employé.

## Technologies Utilisées

* **Langage :** Java
* **Framework :** Spring Boot
* **Dépendances Spring Boot :** Spring Web, Thymeleaf, Lombok, Spring Data JPA, H2 Database, Spring Boot DevTools
* **CSS Framework :** Picnic CSS
* **IDE :** IntelliJ IDEA
* **Gestion de dépendances :** Maven

## Comment Exécuter l'Application

1.  Clonez ce dépôt.
2.  Ouvrez le projet `employee-core` avec IntelliJ IDEA.
3.  Ajoutez le projet `employee-web` en tant que projet Maven dans IntelliJ IDEA (cliquez sur le bouton "+" dans la vue Maven et sélectionnez le fichier `pom.xml` de `employee-web`).
4.  Assurez-vous que la base de données H2 est lancée (elle est généralement configurée pour démarrer automatiquement avec Spring Boot).
5.  Exécutez la classe `EmployeeWebApplication` du projet `employees-web`.
6.  Ouvrez votre navigateur web et accédez à l'URL suivante : `http://localhost:8080/employee/home`.
