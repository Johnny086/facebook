package generic_Utility;

import java.io.IOException;
import pom_Repository.A_LoginPage;
import pom_Repository.B_HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

/**
    * Java doc
    * This class contains all the preconditions and post conditions
    * @author PRASHANT
    */
    public class A_BaseClass {
	public static WebDriver driver;
	//Creating the Objects of all generic classes in Advance for uses
	public B_FileUtility fUtils = new B_FileUtility();
	public D_ExcellUtility eUtils = new D_ExcellUtility();
	public C_WebDriverUtility wUtils = new C_WebDriverUtility();
	public E_JavaUtility jUtils = new E_JavaUtility();
	public static WebDriver sdriver; //
	
	// PRE condition to connect to the data base
	@BeforeSuite
	public void bsConfig() {
		
	System.out.println("The Data base connection has been Established");	
	}
	
	@BeforeClass
	public void bcConfig() throws IOException {	
	String browser = fUtils.fetchDataFromPropertyFile("browser");
	String url = fUtils.fetchDataFromPropertyFile("url");
	if(browser.equals("chrome")) {
	driver = new ChromeDriver();
	}
    else if(browser.equals("firefox")) {
	driver = new FirefoxDriver();
	}	
	else if(browser.equals("edge")) {
	driver = new EdgeDriver();
	}	
	sdriver=driver; //
	System.out.println("The "+browser+" browser has been launched");
	wUtils.waitForPageToLoad(driver);
	wUtils.maximizeWindow(driver);
	driver.get(url);
	 System.out.println("The user has navigated to "+url);	
	}	
	
	@BeforeMethod
	public void bmConfig() throws IOException {	
	String username = fUtils.fetchDataFromPropertyFile("username");
	String password = fUtils.fetchDataFromPropertyFile("password");
	A_LoginPage login = new A_LoginPage(driver);
	login.loginAction(username, password);
	System.out.println("The login was successfull");	
	}
	
	@AfterMethod
	public void amConfig() {
	B_HomePage home=new B_HomePage(driver);
	home.logoutAction();
	System.out.println("The user has logged out successfully");
	}
	
	@AfterClass
	public void acConfig() throws IOException {
	String browser = fUtils.fetchDataFromPropertyFile("browser");
	driver.quit();
	System.out.println("The "+browser+" browser has been closed");	
	}
	
	@AfterSuite
	public void asConfig() {
	
	}
	
}

