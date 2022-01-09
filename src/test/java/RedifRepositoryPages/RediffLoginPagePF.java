package RedifRepositoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {
	WebDriver driver;
	public RediffLoginPagePF(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//input[@id='login1']") WebElement UserName;
@FindBy(xpath="//input[@id='password']") WebElement Password;
@FindBy(linkText="rediff.com") WebElement home;
@FindBy(xpath="//input[@title='Sign in']") WebElement signIn;

public WebElement username()
{
	return UserName;
}
public WebElement Password()
{
	return Password;
}

public WebElement home()
{
	return home;
}

public WebElement signIn()
{
	return signIn;
}

}


