package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C_LeadPage {
	
		public C_LeadPage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	     private  WebElement leadPlusButton;
		
		public WebElement getLeadPlusButton() {
		return leadPlusButton;
			
		}
		public void clickOnLeadButton() {
		leadPlusButton.click();
		
		}

}
