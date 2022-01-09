package RediffTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import RedifRepositoryPages.RedifHomepage;
import RedifRepositoryPages.RediffLoginPage;
import RedifRepositoryPages.RediffLoginPagePF;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RedifTestCasePF {
	@Test
	public void login() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
	
	RediffLoginPagePF pfrl = new RediffLoginPagePF(driver);
	pfrl.username().sendKeys("Student");
	pfrl.Password().sendKeys("Pass123");
	Thread.sleep(2000);
    pfrl.signIn().click();
	pfrl.home().click();
	
	RedifHomepage rh = new RedifHomepage(driver);
	rh.newss().click();
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.close();
	
	}
}
	

