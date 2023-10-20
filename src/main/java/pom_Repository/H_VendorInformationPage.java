package pom_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class H_VendorInformationPage {
	WebDriver driver;
	public H_VendorInformationPage(WebDriver driver ) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
	}
	public String verifyVendorInformationPage(String vendorname) {
	return driver.findElement(By.xpath("//span[contains(text(), '"+vendorname+"')]")).getText();
	}
	
	
}
