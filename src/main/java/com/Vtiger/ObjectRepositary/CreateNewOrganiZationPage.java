package com.Vtiger.ObjectRepositary;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.GenricLibraries.WebDriverUtility;

public class CreateNewOrganiZationPage {
	
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement EditOrgName;
	@FindBy(name = "industry")
	private WebElement industrytype;
	@FindBy(name = "accounttype")
	private WebElement actype;

	public WebElement getActype() {
		return actype;
	}

	public WebElement getIndustrytype() {
		return industrytype;
	}

	public void setIndustrytype(WebElement industrytype) {
		this.industrytype = industrytype;
	}

	public WebElement getEditOrgName() {
		return EditOrgName;
	}
	
	public CreateNewOrganiZationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Giveorgname(String orgname,String value) {
		EditOrgName.sendKeys(orgname);
		WebDriverUtility wilb=new WebDriverUtility();
		wilb.select(value, actype);
	}
	public void IndusType(String value) {
		WebDriverUtility wilb=new WebDriverUtility();
		wilb.select(value, industrytype);
	}

}
