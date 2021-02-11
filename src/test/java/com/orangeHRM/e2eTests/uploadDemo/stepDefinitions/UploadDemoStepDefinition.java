package com.orangeHRM.e2eTests.uploadDemo.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.orangeHRM.e2eTests.uploadDemo.pages.UploadDemoPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UploadDemoStepDefinition {

	public WebDriver driver;
	private UploadDemoPage uploadDemoPage = new UploadDemoPage();
	private CommonMethods commonMethods = new CommonMethods();

	public UploadDemoStepDefinition() {
		driver = Setup.driver;
	}

	@Given("^Je me connecte à l'application DemoGuru(\\d+)$")
	public void jeMeConnecteÀLApplicationDemoGuru() throws Throwable {
		commonMethods.openApplicationWithConfigFile("url-test");
	}

	@When("^Je click sur le boutton$")
	public void jeClickSurLeBoutton() throws Throwable {
		uploadDemoPage.clickButtonSubmit();
		
	}

	@When("^Je telecharge une image$")
	public void jeTelechargeUneImage() throws Throwable {
		
	}

	@When("^Je click sur valider$")
	public void jeClickSurValider() throws Throwable {
		
	}

	@Then("^Affichage message succe$")
	public void affichageMessageSucce() throws Throwable {
		
	}

}
