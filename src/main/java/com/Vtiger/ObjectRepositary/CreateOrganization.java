package com.Vtiger.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganization {

	
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement Createorg;
	
	
	public WebElement getCreateorg() {
		return Createorg;
	}

	public CreateOrganization(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void CreatenewOrganization() {
		Createorg.click();
	}
}
