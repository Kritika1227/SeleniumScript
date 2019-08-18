package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KritikaSoni\\Documents\\Selenium_main\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://elearning.upskills.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("login")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.name("submitAuth")).click();
		driver.findElement(By.xpath("//*[@class= 'block-items-admin']/ul/li[4]/a")).click();
		driver.findElement(By.name("import_file")).sendKeys("C:\\Users\\KritikaSoni\\Desktop\\A1.csv");
		driver.findElement(By.name("check_unique_email")).click();
		driver.findElement(By.name("submit")).click();
		
	}

}
