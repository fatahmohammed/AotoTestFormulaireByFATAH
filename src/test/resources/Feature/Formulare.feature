@SmokeFeature
Feature: Test du formulaire de contact

@smoketest
  Scenario: Remplir et envoyer le formulaire de contact avec succès
    Given Je suis sur la page du formulaire de contact
    When Je saisis "Mohammed" dans le champ Prénom
    And Je saisis "FATAH" dans le champ Nom
    And Je saisis "Testify" dans le champ Entreprise
    And Je saisis "35 Rue Rémy Dumocel, 77210 AVON" dans le champ Adresse
    And Je saisis "fatah.mohammed.in@gmail.com" dans le champ Adresse email
    And Je saisis "+33" dans le champ Espace Code
    And Je saisis "0759878107" dans le champ Numéro de téléphone
    And Je sélectionne "Industrie de la confiserie. " dans le champ Secteur de entreprise
    And Je saisis "Merci c'est juste pour tester ce formulaire" dans le champ Zone de texte
    And Je clique sur J'accepte pour accepter les conditions
    And Je clique sur le bouton "Envoyer"
    Then Je devrais voir un message de succès Thank You indiquant que le formulaire a été envoyé avec succès
