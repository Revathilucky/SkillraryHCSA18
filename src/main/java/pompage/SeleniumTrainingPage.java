package pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.WebDriverUtility;

public class SeleniumTrainingPage {
	
	//Declaration
@FindBy(xpath="//h1[@class='page-header']")
private WebElement pageHeader;
@FindBy(id="add")
private WebElement plusButton;
@FindBy(xpath=" //button[.='Add to Cart']") 
private WebElement addToCardButton;
@FindBy(xpath="")
private WebElement itemAddedMessage;
private Object addToCartButton;


//Initialization
public SeleniumTrainingPage(WebDriver driver) {
	PageFactory.initElements(driver,this );
	
}

//Utilization
public String getPageHeader() {
	return pageHeader.getText(); 
}
public void doubleclickplusButton(WebDriverUtility Web) {
	Web.doubleClickElement(plusButton);
}
public void clickAddToCart() {
	addToCartButton.click();
public WebElement getItemAddedMessage() {
	return itemAddedMessage;
	
	
}


}
