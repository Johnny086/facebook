  package generic_Utility;
	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class C_WebDriverUtility {
		
	public void maximizeWindow(WebDriver driver) {
	driver.manage().window().maximize();
	}

	public void waitForPageToLoad(WebDriver driver) {

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	public void waitForTitleToBeLoaded(WebDriver driver, String title) {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.titleContains(title));
    }

	public void waitForElementToBeClickable(WebDriver driver, WebElement element) {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(element));
	
	}

	public void switchToWindow(WebDriver driver, String lookUpPagetitle) {
		
	}
	

}

