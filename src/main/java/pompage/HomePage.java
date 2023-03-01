package pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//img[@alt='SkillRary']")
	private WebElement logo;
	@FindBy (xpath=" //a[text()=' GEARS '] ")
	private WebElement gearsTab;
	@FindBy(xpath="//ul[@class='dropdown-menu gear_menu']/descendant::a[text()=' SkillRary Demo APP'")
	private WebElement skillraryDemoAppLink;
	
	@FindBy(xpath="")
	private WebElement searchTF;
	@FindBy(xpath="")
	private WebElement searchButton;
	
	
	//Initialization
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public WebElement getLogo() {
		return logo;
		
		 
	}
	
	public void clickGears() {
		gearsTab.click();
	}
		
		public void clickskillraryDemoApp() {
			skillraryDemoAppLink.click();
		}
		public void searchFor(String data) {
			searchTF.sendKeys(data);
			searchButton.click();
			}
	}


