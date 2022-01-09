package TestNGPractice;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


 public class ParameterDemoHRM {
	WebDriver driver;
	
  @Test
  @Parameters ({"browser","Ourl","UsrName","Pwd"})
  public void invokeBrowser (String browser,String url,String UserName,String Password) throws InterruptedException {
	  if (browser.equals("chrome"))
	  {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  

	  }
	  else if (browser.equals("firefox"))
	  {
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();

	  }
		driver.get(url);  
		  driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		  driver.findElement(By.id("txtPassword")).sendKeys(Password);

		  driver.findElement(By.id("btnLogin")).click();
		  Thread.sleep(2000);

  }
  @AfterMethod
  public void afterMethod()
  {
	  driver.close();
  }
}
