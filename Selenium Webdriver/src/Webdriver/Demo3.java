package Webdriver;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KritikaSoni\\Documents\\Selenium_main\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		//Thread.sleep(30000);
		driver.findElement(By.xpath("//*[@name = 'tripType' and @value = 'oneway']")).click();
		WebElement DD = driver.findElement(By.name("passCount"));
		Select sel = new Select(DD);
		List<WebElement> data = sel.getOptions();
		System.out.println(data.size());
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i).getText());
		}
		WebElement DE =driver.findElement(By.name("fromPort"));
		Select del = new Select(DE);
		del.selectByValue("London");
		driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("Kritika");
		driver.findElement(By.name("passLast0")).sendKeys("Soni");
		driver.findElement(By.name("creditnumber")).sendKeys("8887827882");
		List<WebElement> ais = driver.findElements(By.name("ticketLess"));
		/*for(WebElement e:ais)
		{
			e.click();
		}*/
		for(int i=0;i<ais.size();i++)
		{
			ais.get(i).click();
		}
		driver.findElement(By.name("buyFlights")).click();
		
		
		
		

	}

}
