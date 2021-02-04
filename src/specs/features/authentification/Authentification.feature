@connexion
Feature: Authentification - OrangeHRM
  En tant que utilisateur je souhaite m'authentifier

  Background: 
    Given Je me connecte à l'application OrangeHRM

  @cnx
  Scenario: Authentification - OrangeHRM
    When Je saisi Username "Admin"
    And Je saisi Password "admin123"
    And Je click sur le bouton login
    Then Redirection vers le compte admin "Welcome"
