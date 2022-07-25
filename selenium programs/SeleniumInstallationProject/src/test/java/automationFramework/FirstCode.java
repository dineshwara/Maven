package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCode {

	public static void main(String[] args) {
		// we take driver from local disk d
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumm\\selenium programs\\seleniumPrograms\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aeg.be/nl-be/");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();

	}

}
