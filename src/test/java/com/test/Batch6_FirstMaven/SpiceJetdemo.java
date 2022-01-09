package com.test.Batch6_FirstMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetdemo {
	static String browser = "chrome";
	//static String browser;
	static WebDriver driver = null;


	public static void main(String[] args)
	{   
	
    	Startbrowser(browser);


    	driver.get("https://book.spicejet.com/search.aspx");

	}
		static  void Startbrowser(String browser)
		{

		if(browser.equalsIgnoreCase("firefox"))
		{
          WebDriverManager.firefoxdriver().setup();
          driver = new FirefoxDriver();
      	driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	    }
	else if(browser.equalsIgnoreCase("chrome"))
	{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    	driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
		}
}


