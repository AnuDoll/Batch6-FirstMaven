package RedifRepositoryPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	WebDriver driver;
	public RediffLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	By UserName = By.xpath("//input[@id='login1']");
	By Password = By.xpath("//input[@id='password']");
	By signIn= By.name("proceed");
	By home = By.xpath("//a[contains(text(),'rediff.com')]");
	
	


public WebElement userName()

{
	return driver.findElement(UserName);

}

public WebElement Password()
{
	return driver.findElement(Password);
}

public WebElement signIn()
{
	return driver.findElement(signIn);
}
public WebElement home()
{
	return driver.findElement(home);
	
}
}