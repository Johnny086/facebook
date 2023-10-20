package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class A_LoginPage {
		public  A_LoginPage(WebDriver driver) {

			PageFactory.initElements(driver, this);
			} 
			@FindBy(name="user_name")
			private WebElement usernametextfield;
	
			@FindBy(name="user_password")
			private WebElement Passwordtextfield;   

			@FindBy(id="submitButton")
			private WebElement loginButton;
			
			public WebElement usernametextfield() {
				return usernametextfield;
			}
			public WebElement Passwordtextfield() {
				return Passwordtextfield;
			}

			public WebElement loginButton() {
				return loginButton;
			}
			public void loginAction(String username, String password) {
			usernametextfield.sendKeys(username);	
			Passwordtextfield.sendKeys(password);
			loginButton.click();	
			
			}
        }	
	

