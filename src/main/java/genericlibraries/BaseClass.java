package genericlibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompage.ContactUsPage;
import pompage.CoreJavaVedioPage;
import pompage.HomePage;
import pompage.SeleniumTrainingPage;
import pompage.SkillraryDemoAppPage;
import pompage.TestingPage;

public class BaseClass {
	protected Propertiesutility property;
	
	protected Excelutility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected HomePage home;
	protected SkillraryDemoAppPage demoApp;
	protected SeleniumTrainingPage selenium;
	protected TestingPage testing;
	protected CoreJavaVedioPage corejava;
	protected ContactUsPage contact;
	protected CoreJavaVedioPage javavideo;
	
	
	//@BeforeSuite
	//@BeforeTests
	@BeforeClass
	public void classConfiguration() {
		property=new Propertiesutility();
		excel=new Excelutility();
		web=new WebDriverUtility();
		property.propertiesInitiaization(Iconstantpath.PROPERTIES_FILE_PATH);
		excel.excelinitialization(Iconstantpath.EXCEL_FILE_PATH);
		
	}
	@BeforeMethod
	public void methodConfiguration() {
		long time=Long.parseLong(property.fetchproperty("timeOuts"));
		driver=web.openAplication(property.fetchproperty("browser"),property.fetchproperty("url"));
		home=new HomePage(driver);
		Assert.assertTrue(home.getLogo().isDisplayed());
		demoApp=new SkillraryDemoAppPage();
		selenium=new SeleniumTrainingPage(driver);
		testing=new TestingPage(driver);
		corejava=new CoreJavaVedioPage();	
		
		@AfterMethod
		public void methodTeardown() {
			web.quitbrowser();
		}
		@AfterClass
		public void classTeardown() {
			excel.closeExcel();
			}
		//@AfterTEst
		//@AfterDSuite
		}
	
	
	
	
	
	

}
