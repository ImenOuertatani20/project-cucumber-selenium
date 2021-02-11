package com.orangeHRM.e2eTests.color.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ColorPage {



	/* Locators */
	final static String COLOR_XPATH = "//*[@id=\\\"content\\\"]/div[2]/span";
	
	/* FindBy */
	@FindBy(how = How.XPATH, using = COLOR_XPATH)
	public static WebElement colorXpath;
	
	/* Methods */
	public void fillColor(String color) {		
		colorXpath.getCssValue(color);
	}

	
}
