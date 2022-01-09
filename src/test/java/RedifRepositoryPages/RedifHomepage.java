package RedifRepositoryPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RedifHomepage {
WebDriver driver=null;

public RedifHomepage(WebDriver driver)// constuctor
{
	this.driver=driver; //here this means local object
}

By news= By.linkText("NEWS");
public WebElement newss() //user defined method
{
//	return driver.findElement(By.ByLinkText)
	return driver.findElement(news);
	
}

}
