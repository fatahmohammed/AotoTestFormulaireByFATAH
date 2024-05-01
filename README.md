# 👋 FATAH Mohammed 👋
# Un test automatisé pour tester le formulaire de contact de JotForm. L'URL : https://form.jotform.com/240846038897571.
# 🌱tester en Java, Selenium et Cucumber🌱.

Ce projet est une application Java qui effectue un Test basé sur sélénium et cucumbre.

# ⚡ Soumission du formulaire de contact

Ce projet est destiné à tester la fonctionnalité de soumission du formulaire de contact sur le site de l'entreprise.

## ⚡ Objectif

Ce projet a pour objectif principal de garantir que les utilisateurs peuvent soumettre avec succès le formulaire de
contact afin d'entrer en contact avec l'entreprise. Il vise également à vérifier que les utilisateurs peuvent soumettre
le formulaire avec des erreurs, et à s'assurer que des messages d'erreur ou de succès s'affichent lors de
l'envoi du formulaire.

## ⚡ Prérequis

- Avant de commencer, assurez-vous d'avoir Java JDK 17 ou + installé sur votre système.
- Maven installé
- Navigateur Web compatible ( Chrome )
- WebDriver compatible avec votre navigateur installé ( ChromeDriver)

## ⚡ Installation

1. Clonez ce dépôt sur votre machine locale.
2. Importez le projet dans votre environnement de développement Java préféré IntelliJ IDEA.
3. Configurez les dépendances nécessaires .
4. Exécutez le projet en utilisant la class TestRun ou directement en exécutant le fichier Formulaire.feature

## ⚡ Structure du Projet

Dans ce projet j'ai utilisé le modèle Page Object (POM) pour organiser les tests de manière efficace. Voici la structure
du projet :

- **`src/main/java/StepDef`** : Contient les classes pour les objets de page. Les fichiers sont :
    - `ContactFormPage.java` : Class représentant le modèle objet du formulaire de contact (POM) "
      jotform". https://form.jotform.com/240846038897571
    - `Formulaire.java` : Class décrivant les scénarios de test.
    - `TestRun.java` : Class qui génère les rapports HTML, XML et JSON.
    - `Utils.java` : Class contenant des méthodes à utilisé.

- **`src/test/resources/Feature`** : Contient le fichier `Formulaire.feature` qui décrit deux scénarios de test, l'un
  pour le succès et l'autre pour les erreurs.

## ⚡ Configuration

Avant d'exécuter les tests, assurez-vous de recharger Maven pour télécharger les dépendances nécessaires en exécutant la
commande suivante :


⚡⚡⚡⚡⚡⚡⚡
```bash
mvn clean install 





