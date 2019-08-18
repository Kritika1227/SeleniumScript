package Webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KritikaSoni\\Documents\\Selenium_main\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://realestate.upskills.in/admin");
		driver.manage().window().maximize();
		driver.findElement(By.name("log")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("adminuser@123");
		driver.findElement(By.name("login")).click();
		String title1 = driver.getTitle();
		WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
		Actions act = new Actions(driver);
		act.contextClick(link).build().perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.DOWN,Keys.ENTER).build().perform();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_TAB);
		
		String title2 = driver.getTitle();
		if(title1.equals(title2) )
		{
			System.out.println("Same");
			
		}
		else
			System.out.println("Not same");
		

	}

}
