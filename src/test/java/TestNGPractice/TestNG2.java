package TestNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG2 {
  @Test
  public void Method1() {
	  System.out.println("@TestMethod1 - implementation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod - implementation");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod - implementation");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass - implementation");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass - implementation");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest - implementation");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest - implementation");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@BeforeSuite - implementation");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite - implementation");

  }

}
