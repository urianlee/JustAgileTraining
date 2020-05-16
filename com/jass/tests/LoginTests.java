package com.jass.tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jass.common.CommonMethods;
import com.jass.pages.WelcomeToiBusinessPage;
import com.jass.pages.PleaseSignInPage;
import com.jass.common.ReadPropertyFile;
import com.jass.common.ScreenCapture;

public class LoginTests {
	private WebDriver driver;
	CommonMethods CM;
	WelcomeToiBusinessPage WelcomePage;
	
	ReadPropertyFile ReadPropertyFile;
	
	@BeforeMethod
	public void setUp() {
		CM = new CommonMethods();
		ReadPropertyFile = new ReadPropertyFile();
		String getBrowser = ReadPropertyFile.getConfigPropertyVal("sBrowserType");
		String getURL = ReadPropertyFile.getConfigPropertyVal("sURL");
		driver = CM.openBrowser(getBrowser);
		CM.gotoURL(getURL);
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown(ITestResult it) throws Exception {
		ScreenCapture ScreenCapture = new ScreenCapture(driver);
		ScreenCapture.takeScreenShoot(it.getMethod());
		System.out.println("Screenshot captured for: "+it.getMethod()+" Failed TestCase");
		CM.closeBrowser();
	}
	
	@Test
	public void testcase01() throws InterruptedException {
		WelcomePage = new WelcomeToiBusinessPage(driver);
		WelcomePage.clickLogYourselfLink();
		PleaseSignInPage SignInPage = new PleaseSignInPage(driver);
		SignInPage.Login("ecalix@test.com","test123");
		WelcomePage.verifyHeader();
		WelcomePage.clickLogOff();
	}
	
	
}
