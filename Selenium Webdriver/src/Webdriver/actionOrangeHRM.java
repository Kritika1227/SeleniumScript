package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionOrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KritikaSoni\\Documents\\Selenium_main\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//WebElement link = driver.findElement(By.name("Submit"));
		Actions act = new Actions(driver);
		//act.sendKeys(link, (Keys.ENTER)).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		//act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).build().perform();
		//driver.navigate().back();
		act.moveToElement(driver.findElement(By.linkText("PIM"))).build().perform();
		act.moveToElement(driver.findElement(By.linkText("Employee List"))).build().perform();
		driver.findElement(By.linkText("Employee List")).click();
		act.sendKeys(Keys.DOWN,Keys.DOWN,Keys.DOWN).build().perform();
		
	}

}
