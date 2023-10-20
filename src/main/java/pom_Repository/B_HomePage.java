package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B_HomePage {
	WebDriver driver;
	
	public B_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this); // Allow Selenium in java Script by PageFactory 
		this.driver=driver;
	}
	// Identifies All WebElement by Locators 
	@FindBy(linkText="Leads")
	private WebElement leadsModule;
	
	@FindBy(linkText="Organizations")
	private WebElement organizationsModule;
	
	@FindBy(linkText="Contacts")
	private WebElement contactsModule;
	

	@FindBy(linkText="Opportunities")
	private WebElement opportunitiesModule;
	
	@FindBy(linkText="Products")
	private WebElement productsModule;
	
	@FindBy(linkText="More")
	private WebElement moreModule;
	
	@FindBy(linkText="Campaigns")
	private WebElement campaignsModule;
	
	
	@FindBy(linkText="Vendors")
	private WebElement vendorsModule;
	
	@FindBy(linkText="Sales Order")
	private WebElement salesOrderModule;
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement administrativeImage;
	
	@FindBy(linkText="Sign Out")
	private WebElement signOutOption;
	
	// Access all private Element by get() Method
	public WebElement getLeadsModule() {
		return leadsModule;
	}

	public WebElement getOrganizationsModule() {
		return organizationsModule;
	}

	public WebElement getContactsModule() {
		return contactsModule;
	}

	public WebElement getOpportunitiesModule() {
		return opportunitiesModule;
	}

	public WebElement getProductsModule() {
		return productsModule;
	}

	public WebElement getMoreModule() {
		return moreModule;
	}

	public WebElement getCampaignsModule() {
		return campaignsModule;
	}

	public WebElement getVendorsModule() {
		return vendorsModule;
	}

	public WebElement getSalesOrderModule() {
		return salesOrderModule;
	}

	public WebElement getAdministratorImage() {
		return administrativeImage;
	}

	public WebElement getSingOutOption() {
		return signOutOption;
	}
	// Make all WebElement as a method for future use and action
	public void clickOnLeadModule() {
		leadsModule.click();
	}
	
	public void clickOnOrganizationModule() {
		organizationsModule.click();
	}
	
	public void clickOnContactsModule() {
		contactsModule.click();
	}
	
	public void clickOnOpportinitiesModule() {
		opportunitiesModule.click();
	}
	
	public void clickOnProductModule() {
		productsModule.click();
	}
	// Here use action to move cursor
	public void clickOnCampaignModule() {
		
		new Actions(driver).moveToElement(moreModule).perform();
		campaignsModule.click();
		
	}
	
	public void clickOnVendorModule() {
		new Actions(driver).moveToElement(moreModule).perform();
		vendorsModule.click();
	}
	
	public void clickOnSalesOrderModule() {
		new Actions(driver).moveToElement(moreModule).perform();
		salesOrderModule.click();
	}
	
	public void logoutAction() {
	new Actions(driver).moveToElement(getAdministratorImage()).perform();
	signOutOption.click();
		
	}
	

}
	
	
	

