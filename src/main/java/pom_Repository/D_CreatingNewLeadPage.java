package pom_Repository;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public class D_CreatingNewLeadPage {
		public D_CreatingNewLeadPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		@FindBy(name="salutationtype") // DropDown Salutation Button
		private WebElement leadNameSalutatioknDropdown;
		
		@FindBy(name="firstname") 
		private WebElement leadFirstNameTextbox;
		

		@FindBy(name="lastname") // DropDown Salutation Button
		private WebElement leadLastnameTextbox;
		
		@FindBy(name="company") 
		private WebElement leadCompanyNameTextbox;
		
		@FindBy(name="industry") 
		private WebElement industryDropdown;
		
		@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
		private WebElement saveButton;
		
		public WebElement getleadNameSalutatioknDropdown() {
		return leadNameSalutatioknDropdown;
		}
		
		public WebElement getleadFirstNameTextbox() {
		return leadFirstNameTextbox;
		}
		
		public WebElement getleadLastnameTextbox() {
		return leadLastnameTextbox;
		}
		
		public WebElement getleadCompanyNameTextbox() {
		return leadCompanyNameTextbox;
		}
		
		public WebElement industryDropdown() {
		return industryDropdown;
		}
		
		public WebElement getSaveButton() {
		return saveButton;
		}
		
		public void leadNameSalutatioknDropdown(String option) {
		Select select=new Select(leadNameSalutatioknDropdown);
		select.selectByVisibleText(option);
		}
		
		public void enterFirstName(String firstName) {
		leadFirstNameTextbox.sendKeys(firstName);
		}
		
		public void enterLastName(String lastName) {
		leadLastnameTextbox.sendKeys(lastName);
		}
		
		public void enterCompanyName(String companyName) {
		leadCompanyNameTextbox.sendKeys(companyName);
		}
		
		public void passLeadIndustryInIndustryDropdown(String option) {
		Select select=new Select(industryDropdown);
		select.selectByVisibleText(option);
		}
		
		public void clickOnSaveButton() {
		saveButton.click();
		}		
}
