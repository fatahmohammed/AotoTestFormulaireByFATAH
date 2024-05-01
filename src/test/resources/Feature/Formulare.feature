@SmokeFeature
Feature: Soumission du formulaire de contact
  En tant qu'utilisateur, je veux soumettre le formulaire de contact avec succès afin de me mettre en contact avec l'entreprise
  t
  En tant qu'utilisateur, je veux soumettre le formulaire de contact  sans remplir et des messages d'erreurs s'affiche.

  @smoketest
  Scenario: Soumission réussie du formulaire de contact
    Given l'utilisateur accède à la page du formulaire de contrat
    When l'utilisateur remplit les details suivants :
      | Prénom   | Nom   | Nom de l'entreprise | Adresse                         | Adresse email               | Code du pays | Numéro de téléphone | Secteur                     | Message                               |
      | Mohammed | FATAH | Testify             | 35 Rue Rémy Dumocel, 77210 AVON | fatah.mohammed.in@gmail.com | +33          | 0759878107          | Industrie de la confiserie. | Merci pour avoir testé ce formulaire. |
    And l'utilisateur accepte les conditions
    And l'utilisateur soumit le formulaire
    Then un message de succès "Thank You!" s'affiche
  @smoketest
  Scenario: Soumission non réussie du formulaire de contact sans remplir les détails
    Given l'utilisateur accède à la page du formulaire de contrat
    When l'utilisateur soumit le formulaire
    Then des messages d'erreur s'affiche

