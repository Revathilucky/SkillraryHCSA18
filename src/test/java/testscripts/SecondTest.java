package testscripts;

import org.openqa.selenium.support.How;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class SecondTest extends BaseClass {

	@Test
	public void firstTest() {
		SoftAssert soft=new SoftAssert();
		 
	
		home.clickGears();
		home.clickSkillraryDemoApp();
		Web.switchToChildBrowser();
		
		soft.assertEquals(demoApp.getPageHeader(),"Skillrary-Ecommerce");
		demoApp.selectCategory(web,1);
		
		soft.assertEquals(testing.getHeader(),"Testing");
		web.dragAndDoropElement(testing.getJavaImage(),testing.getMyCartArea());
		web.scrollToElement(testing.getFacebookIcon());
		testing.clickFacebookIcon();
		
		soft.assertAll();
		
		
		
	}
}
