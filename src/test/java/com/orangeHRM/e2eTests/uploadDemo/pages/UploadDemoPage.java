package com.orangeHRM.e2eTests.uploadDemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class UploadDemoPage {

	/* Locators */
	final static String FILENAME_ID = "uploadfile_0";
	final static String BUTTON_SUBMIT_ID = "submitbutton";

	/* FindBy */
	@FindBy(how = How.ID, using = FILENAME_ID)
	public static WebElement fileName;
	@FindBy(how = How.ID, using = BUTTON_SUBMIT_ID)
	public static WebElement btnSubmit;
	
	/* Methods */
	public void fillFileName(String file) {
		fileName.sendKeys(file);
	}

	
	public void clickButtonSubmit() {
		btnSubmit.click();
	}

}
