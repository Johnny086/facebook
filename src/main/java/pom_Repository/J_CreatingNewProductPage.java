package pom_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_Utility.C_WebDriverUtility;

 public class J_CreatingNewProductPage {
 
private static final String WebDriverUtility  = null;

private static final String Productpagetitle = null;

WebDriver driver;
 public J_CreatingNewProductPage(WebDriver driver) {
 PageFactory.initElements(driver, this); 	 
 }
 
 @FindBy (name="productname")
 private WebElement productNameTextField;
 
 @FindBy (name="sales_start_date")
 private WebElement salesStartDate;
 
 @FindBy (name="sales_end_date")
 private WebElement salesEndDate;
 
 @FindBy(xpath="//img[@alt=\"Select\"]")
 private WebElement vendorNameLookUpButton;
 
 @FindBy(name="search_text")
 private WebElement vendorNameSearchbox;
 
 @FindBy(name="search")
 private WebElement vendorNameSearchButton;
 
 @FindBy(id="my_file_element")
 private WebElement ProductImageUpload;
 
 @FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
 private WebElement SaveButton;
 
 public WebDriver getDriver() {
 return driver;
}

 public WebElement getProductNameTextField() {
 return productNameTextField;
}

public WebElement getSalesStartDate() {
return salesStartDate;
}

public WebElement getSalesEndDate() {
return salesEndDate;
}

public WebElement getVendorNameLookUpButton() {
return vendorNameLookUpButton;
}

public WebElement getVendorNameSearchbox() {
	return vendorNameSearchbox;
}

public WebElement getVendorNameSearchButton() {
	return vendorNameSearchButton;
}

 public WebElement getProductImageUpload() {
 return ProductImageUpload;
}

 public WebElement getSaveButton() {
 return SaveButton;
}

 public void enterProductName(String productName) {
 productNameTextField.sendKeys(productName);
}

 public void enterSalesStartDate(String startDate) {
 salesStartDate.sendKeys(startDate);
}

 public void enterSalesEndDate(String SalesEndDate) {
 salesEndDate.sendKeys(SalesEndDate);
}

 public void clickOnLookupButton() {
 vendorNameLookUpButton.click();
}

 public void selectvendorNameFromLookPage(String lookUpPagetitle, String VendorName) {
 C_WebDriverUtility wUtils = new C_WebDriverUtility();
 wUtils.switchToWindow(driver,lookUpPagetitle);
 vendorNameSearchbox.sendKeys(VendorName);
 vendorNameSearchButton.click();
 driver.findElement(By.xpath("//a[text()='"+VendorName+"']")).click();
 wUtils.switchToWindow(driver, Productpagetitle);
 }

 public void uploadProductIamge(String path) {
 ProductImageUpload.sendKeys(path);
 }
 public void clickOnSavebutton() {
 SaveButton.click();
}

public void clickOnSearchedvendorName(String vendorname) {
 driver.findElement(By.xpath("//a[text()='Excide']")).click();
 }
}
