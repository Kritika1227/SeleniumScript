package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Retail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KritikaSoni\\Documents\\Selenium_main\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://retail.upskills.in/admin/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//*[@class = 'btn btn-primary' and @type = 'submit']")).click();
		WebElement link = driver.findElement(By.id("menu-catalog"));
		Actions act = new Actions(driver);
		act.moveToElement(link).click().build().perform();
	}

}
