package com.orangeHRM.e2eTests.color.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.orangeHRM.e2eTests.color.pages.ColorPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

public class ColorStepDefinition {

	public WebDriver driver;
	private ColorPage colorPage = new ColorPage();
	private CommonMethods commonMethods = new CommonMethods();

	public ColorStepDefinition() {
		driver = Setup.driver;
	}

}
