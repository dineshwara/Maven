package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


@SuppressWarnings("unused")
public class YourLogoForTestNG {
	WebDriver driver;

       @Test
        public void method() {
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumm\\selenium programs\\seleniumPrograms\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.aeg.be/nl-be/");
		driver.manage().window().maximize();
       }
       @Test
       public void methodTwo() {
       driver.findElement(By.id("onetrust-accept-btn-handler")).click();
       }
}
