package TestNGPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadExcelFile {
	WebDriver driver;
  @BeforeTest
  public void invokeBrowser() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }
 @Test
  public void readData() throws InterruptedException, IOException
  {
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  String ExcelPath = "C:\\Users\\Genious\\Desktop\\Selenium\\pratice.xlsx";
	  String fileName = "pratice";
	  String sheetName = "Sheet1";
	  File file = new File(ExcelPath);
	  FileInputStream fis = new FileInputStream(file);
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sheet = wb.getSheet(sheetName);;;
	  int rowCount =sheet.getLastRowNum();
	  System.out.println(rowCount);
	  int i=1, j=1;
	  while(true)
	  {
		  String UserName =sheet.getRow(i).getCell(0).getStringCellValue();
		  String Password =sheet.getRow(i).getCell(1).getStringCellValue();
		  
		  driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		  driver.findElement(By.id("txtPassword")).sendKeys(Password);

		  driver.findElement(By.id("btnLogin")).click();
		  Thread.sleep(2000);
		  
		  boolean error =driver.findElement(By.id("spanMessage")).isDisplayed();
		  if(error)
		  {
			  i++;
			  j++;
		  }
		  else
		  {
			  break;
		  }
	  }
	  wb.close();
  }
  
  @AfterMethod
  public void afterMethod()
  {
	  driver.close();
  }

}