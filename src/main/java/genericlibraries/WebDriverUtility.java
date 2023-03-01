package genericlibraries;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	
	private WebDriver driver;
	public WebDriver openApplication(String browser,String url,long time) {
		
		switch(browser) {
		 
		case "chrome":driver = new ChromeDriver();break;
		case "firefox":driver = new FirefoxDriver();break;
		case "edge":driver = new EdgeDriver();break;
		default :System.out.println("Invalid browser data");
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		
		}
	
	public WebElement explicitWait(WebElement element,long time) {
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		return Wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void doubleClickElement(WebElement element) {
		Actions a =new Actions(driver);
		a.doubleClick(element).perform();
	}
	public void dragAndDropElement(WebElement source, WebElement target) 
	{
		Actions a =new Actions(driver);
		
		a.dragAndDrop(source,target);
	}

	public WebDriver openAplication(String fetchproperty, String fetchproperty2) {
		// TODO Auto-generated method stub
		return null;
	}

	public void quitbrowser() {
		// TODO Auto-generated method stub
		
	}
	
		
		
		
	}



