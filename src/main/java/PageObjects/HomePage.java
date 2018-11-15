package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;
	//By menuUser = By.linkText("Users");
	
	//public HomePage(WebDriver driver) {
		//this.driver=driver;
	//}

	private static WebElement element = null;
	public static WebElement lnk_users(WebDriver driver){
		 

		element = driver.findElement(By.linkText("Users"));
		   // driver.findElement(By.linkText("Users")).click();
		   return element;
		 
		   }
	public static Select selectFilter(WebDriver driver) {
		Select element = new Select(driver.findElement(By.id("select name id")));
		return element;
		
	}
		    
	public static WebElement fitlername(WebDriver driver){

		element =  driver.findElement(By.id("q_username"));
		   return element;
		 
		   }
	
	public static WebElement submit(WebDriver driver){ 

		element =   driver.findElement(By.id("commit")); 
		   return element;		 
		   }

	 public void clickUsers() {
		 driver.findElement(By.linkText("Users")).click();
		 
	 }
	
}
