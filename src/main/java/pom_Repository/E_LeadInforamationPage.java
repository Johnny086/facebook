package pom_Repository;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;

	public class E_LeadInforamationPage {
		
		WebDriver driver;
		public E_LeadInforamationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		}
		// Here Verify lead Information Page or Not 
		public String verifyLeadInformation(String lastname) {
		return driver.findElement(By.xpath("//span[contains(text(), '"+lastname+"')]")).getText();
			
		}
	}

