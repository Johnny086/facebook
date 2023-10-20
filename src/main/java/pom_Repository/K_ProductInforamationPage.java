package pom_Repository;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.support.PageFactory;


  public class K_ProductInforamationPage {
		
  WebDriver driver;
		
  public K_ProductInforamationPage(WebDriver driver) {
			
  PageFactory.initElements(driver, this);
  this.driver = driver;
 }
		
   public String verifyProductInformation(String productName) {
   return driver.findElement(By.xpath("//span[contains(text(), '"+productName+"')]")).getText();
   }
}
