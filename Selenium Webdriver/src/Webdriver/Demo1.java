package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KritikaSoni\\Documents\\Selenium_main\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		String Expectedtitle = "OrangeHRM";
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		String ActualTitle = driver.getTitle();
		if(Expectedtitle.equals(ActualTitle))
		  System.out.println("Title is same");
		  else
			  System.out.println("Not same");
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		driver.close();
		driver.quit();
				
		}

}
