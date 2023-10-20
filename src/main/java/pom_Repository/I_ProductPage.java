package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class I_ProductPage {

	  public I_ProductPage(WebDriver driver) {
	  PageFactory.initElements(driver, this );	
	  }
	  @FindBy(xpath="//img[@title=\"Create Product...\"]")
	  private WebElement ProductPlusButton;
	  
	  
	  public WebElement getProductPlusButton() {
	  return ProductPlusButton;
	  }
	  public void clickOnProductPlusButton() {
	  ProductPlusButton.click();
	  }
}
