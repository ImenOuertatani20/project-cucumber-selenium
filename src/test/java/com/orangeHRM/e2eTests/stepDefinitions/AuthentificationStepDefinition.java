package com.orangeHRM.e2eTests.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.pageObject.AuthentificationPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition {
	
	public WebDriver driver;
	private AuthentificationPage authentificationPage = new AuthentificationPage();
	private CommonMethods commonMethods = new CommonMethods();
	public AuthentificationStepDefinition() {
		driver = Setup.driver;
	}

	@Given("^Je me connecte à l'application OrangeHRM$")
	public void jeMeConnecteÀLApplicationOrangeHRM() throws Throwable {
		commonMethods.openApplicationWithConfigFile();
	}

	@When("^Je saisi Username$")
	public void jeSaisiUsername() throws Throwable {
		PageFactory.initElements(driver, AuthentificationPage.class);
		authentificationPage.fillUserName();
	}

	@When("^Je saisi Password$")
	public void jeSaisiPassword() throws Throwable {
		authentificationPage.fillPassword();
	}
	
	@When("^Je click sur le bouton login$")
	public void jeClickSurLeBoutonLogin() throws Throwable {
		authentificationPage.clickButtonLogin();
	}

	@Then("^Redirection vers le compte admin$")
	public void redirectionVersLeCompteAdmin() throws Throwable {
		
	}

}
