package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

  public class F_VendorPage {

  public F_VendorPage(WebDriver driver) {
  PageFactory.initElements(driver, this );	
  }
  @FindBy(xpath="//img[@title=\"Create Vendor...\"]")
  private WebElement VenderPlusButton;
  
  
  public WebElement getVenderPlusButton() {
  return VenderPlusButton;
  }
  public void clickOnVendorPlusButton() {
  VenderPlusButton.click();
  }
  
}


