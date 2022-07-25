package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParaBankTestng {
	WebDriver driver;
	
	@Test (priority = 1)
	public void pageLoad() {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().window().maximize();
	}
   
	@Test (priority = 2)
	public void formFilling() {
		driver.findElement(By.xpath("//b[contains(text(),'First Name:')]/following::input[1]")).sendKeys("dinesh");
		driver.findElement(By.xpath("//b[contains(text(),'Last Name:')]/following::input[1]")).sendKeys("waran");
		driver.findElement(By.xpath("//b[contains(text(),'Address:')]/following::input[1]")).sendKeys("abc,street, bba town");
		driver.findElement(By.xpath("//b[contains(text(),'City')]/following::input[1]")).sendKeys("chennai");
		driver.findElement(By.xpath("//b[contains(text(),'State')]/following::input[1]")).sendKeys("tamilnadu");
		driver.findElement(By.xpath("//b[contains(text(),'Zip')]/following::input[1]")).sendKeys("654345");
		driver.findElement(By.xpath("//b[contains(text(),'Phone')]/following::input[1]")).sendKeys("9876451236");
		driver.findElement(By.xpath("//b[contains(text(),'SSN')]/following::input[1]")).sendKeys("987654321");
		driver.findElement(By.id("customer.username")).sendKeys("dinesh waran");
		driver.findElement(By.id("customer.password")).sendKeys("din54321");
		driver.findElement(By.id("repeatedPassword")).sendKeys("din54321");
		WebElement register = driver.findElement(By.xpath("//b[contains(text(),'Confirm:')]/following::input[2]"));
		register.click();
	}
	@Test (priority = 3)
	public void close() {
		driver.quit();
	}
}
