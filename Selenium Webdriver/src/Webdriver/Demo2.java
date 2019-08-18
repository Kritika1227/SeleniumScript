package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KritikaSoni\\Documents\\Selenium_main\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		WebElement UN = driver.findElement(By.name("userName"));
		
		if(UN.isEnabled())
		{
			UN.sendKeys("sunil");
			//Thread.sleep(3000);
			//UN.clear();
		}
		
		if(driver.findElement(By.name("userName")).isDisplayed())
		{
			 System.out.println(UN.getAttribute("value"));
			//String name = UN.getAttribute("value");
			//System.out.println(name);
		}
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		
		
		
		
	}


	
}
