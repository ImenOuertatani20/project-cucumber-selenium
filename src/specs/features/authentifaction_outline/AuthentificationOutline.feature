@outline
Feature: Authentification Outline - OrangeHRM
  En tant que utilisateur je saouhaite m'authentifier avec un scenario outline

  Background: 
    Given Je me connecte à l'application OrangeHRM

  @cnx-outline
  Scenario Outline: Authentification Outline - OrangeHRM
    When je saisi Username "<name>"
    And je saisi Password "<password>"
    And je click sur le bouton login

    Examples: 
      | name    | password   |
      | Admin   | admin123   |
      | safa    | safa123    |
      | hanen   | hanen123   |
      | imen    | imen123    |
      | sondes  | sondes123  |
      | zied    | zied23     |
      | zakaria | zakaria123 |
