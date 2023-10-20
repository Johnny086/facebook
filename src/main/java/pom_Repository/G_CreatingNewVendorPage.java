package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class G_CreatingNewVendorPage {

	public G_CreatingNewVendorPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	@FindBy(name="vendorname") 
	private WebElement vendornametextfield;
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement SaveButton;
	
	public WebElement getvendornametextfield() {
	return getvendornametextfield();
	}
	
	public WebElement getSaveButton() {
	return SaveButton;
	}
	public void EntervenderName(String vendorname) {
	vendornametextfield.sendKeys(vendorname);
	}
	public void ClickonSaveButton() {
		SaveButton.click();
	}
	
}
