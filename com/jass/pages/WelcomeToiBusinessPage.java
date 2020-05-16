package com.jass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.jass.common.*;

public class WelcomeToiBusinessPage {
	private WebDriver driver;
	CommonMethods CM;
	
	@FindBy(how=How.XPATH, using="//*[@id='bodyContent']/h1")
	private WebElement HEADER;
	
	@FindBy(linkText="log yourself in")
	private WebElement LOGYOURSELFINLINK;
	
	@FindBy(how=How.XPATH, using="//*[@id='tdb4']/span")
	private WebElement LOGOFF;
	
	public WelcomeToiBusinessPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		CM = new CommonMethods();
	}
	
	public void clickLogOff() {
		CM.click(LOGOFF);
	}
	
	public void clickLogYourselfLink() {
		CM.click(LOGYOURSELFINLINK);
	}
	
	public void verifyHeader() {
		String ExpectedText = "Welcome to iBusiness";
		CM.verifyText(HEADER, ExpectedText);
	}
}

