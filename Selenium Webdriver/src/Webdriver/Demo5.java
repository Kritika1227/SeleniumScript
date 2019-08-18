package Webdriver;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyAdapter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KritikaSoni\\Documents\\Selenium_main\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement link = driver.findElement(By.linkText("Car Rentals"));
		Actions act = new Actions(driver);
		Action mouseover = act.moveToElement(link).build();
		mouseover.perform();
		act.sendKeys(link, (Keys.ENTER)).perform();
		
	}

}
