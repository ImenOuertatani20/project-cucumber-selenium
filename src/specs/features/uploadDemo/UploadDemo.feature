@upload
Feature: UploadDemo - DemoGuru99
  En tant que utilisateur je souhaite telecharger une image

  @cnx
  Scenario: upload image
    Given Je me connecte à l'application DemoGuru99
    When Je click sur le boutton
    And Je telecharge une image
    And Je click sur valider
    Then Affichage message succe
   