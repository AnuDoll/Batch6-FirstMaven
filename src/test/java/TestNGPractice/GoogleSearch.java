package TestNGPractice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class GoogleSearch {
	@Test
	public void search() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Testing");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//b[contains(text(),'interview')]")).click();

		//using indexing[2] to a next option 
		driver.findElement(By.xpath("(//b[contains(text(),'interview')])[2]")).click();
		
		Thread.sleep(1000);
		driver.close();
	}
	

	

}
