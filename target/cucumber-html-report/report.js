$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentification/Authentification.feature");
formatter.feature({
  "line": 2,
  "name": "Authentification - OrangeHRM",
  "description": "En tant que utilisateur je souhaite m\u0027authentifier",
  "id": "authentification---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@connexion"
    }
  ]
});
formatter.before({
  "duration": 12089703500,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Je me connecte à l\u0027application OrangeHRM",
  "keyword": "Given "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeConnecteÀLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 7721846500,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Authentification - OrangeHRM",
  "description": "",
  "id": "authentification---orangehrm;authentification---orangehrm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@cnx"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Je saisi Username \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Je saisi Password \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Je click sur le bouton login",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Redirection vers le compte admin \"Welcome\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 19
    }
  ],
  "location": "AuthentificationStepDefinition.jeSaisieUsername(String)"
});
formatter.result({
  "duration": 795999600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 19
    }
  ],
  "location": "AuthentificationStepDefinition.jeSaisiePassword(String)"
});
formatter.result({
  "duration": 357647900,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeClickSurBoutonLogin()"
});
formatter.result({
  "duration": 6336637100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome",
      "offset": 34
    }
  ],
  "location": "AuthentificationStepDefinition.redirectionVersLeCompteAdmin(String)"
});
formatter.result({
  "duration": 480765700,
  "status": "passed"
});
formatter.after({
  "duration": 1119847900,
  "status": "passed"
});
});