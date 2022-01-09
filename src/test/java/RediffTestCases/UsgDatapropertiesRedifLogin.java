package RediffTestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import RedifRepositoryPages.RedifHomepage;
import RedifRepositoryPages.RediffLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UsgDatapropertiesRedifLogin {

	@Test
	public void login() throws InterruptedException, IOException
	{
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		Properties prop = new Properties(); // get the property file
		FileInputStream fis=new FileInputStream("C:\\Users\\Genious\\eclipse-workspace\\Batch6-FirstMaven\\src\\test\\java\\RedifRepositoryPages\\data.properties");
		prop.load(fis);
	
	RediffLoginPage rl = new RediffLoginPage(driver);
	rl.userName().sendKeys(prop.getProperty("username"));
	rl.Password().sendKeys(prop.getProperty("password"));
	Thread.sleep(2000);
	rl.signIn().click();
	rl.home().click();
	
	RedifHomepage rh = new RedifHomepage(driver);
	rh.newss().click();
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.close();
	
	}
}
	

