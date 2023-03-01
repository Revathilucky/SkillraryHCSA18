package testscripts;

import java.util.List;

import org.testng.asserts.SoftAssert;

public class FourthTest {
	public void fourthTest() {
		SoftAssert soft = new SoftAssert();
		
		home.clickGears();
		home.clickSkillraryDemoApp();
		web.switchToChildBrowser();
		
		soft.assertEquals(demoApp.getPAgeHeader(),"Skillrary-Ecommerce");
		
		web.scrollToElementdemoApp.getContactUs());
		demoApp.clickContactUs();
		
		soft.assertTrue(contact.getPageHeader().isDisplayed());
		List<String>dataList = excel.readDataFromExcel("Sheet1");
		contact.sendcontactDetails(dataList.get(0),)
	}

}
