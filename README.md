# Gestion des employés : Application Java pour petite entreprise

## Présentation
Cette application Java vise à gérer la hiérarchie et les informations des employés dans une petite entreprise. Elle permet de :
- **Stocker** les données des employés (nom, salaire, rôle) dans une base de données MySQL.
- **Gérer** les relations hiérarchiques (directeur, manager, développeur).
- **Afficher** les informations des employés selon l'organisation hiérarchique.

## Architecture technique
- **Langage** : Java
- **Base de données** : MySQL
- **Framework/Bibliothèque** : JDBC pour l'accès aux données

### Structure
- `ma.projet.connexion` : Connexion à la base de données.
- `ma.projet.beans` : Entités (Personne, Manager, Développeur).
- `ma.projet.dao` : Interfaces et implémentations pour les opérations CRUD.
- `ma.projet.service` : Services pour la logique métier.
- `ma.projet.test` : Classe de test pour création et affichage des employés.

## Fonctionnalités principales
- **Création** d'employés (directeur, manager, développeur).
- **Gestion** des relations hiérarchiques.
- **Affichage** des informations organisées par hiérarchie.

## Installation et utilisation
1. Configurer le fichier `base.properties` en adaptant les informations de connexion à votre base MySQL.
2. Importer le projet dans un IDE compatible.
3. Exécuter la classe `Entreprise` pour créer des employés et visualiser les résultats.

