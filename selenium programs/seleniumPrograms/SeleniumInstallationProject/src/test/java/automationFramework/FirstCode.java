package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class FirstCode {
	WebDriver driver;
	@Test
		public void one() {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumm\\selenium programs\\seleniumPrograms\\driver\\chromedriver.exe");
	     driver = new ChromeDriver();
		driver.get("https://www.aeg.be/nl-be/");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.id("onetrust-accept-btn-handler"));
		name.click(); 
	}
  
}
