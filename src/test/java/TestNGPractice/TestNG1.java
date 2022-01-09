package TestNGPractice;

import org.testng.annotations.Test;

public class TestNG1 {
  @Test (groups= {"smoke"},priority=1)
  public void Test1() {
	  System.out.println("Welcome to TestNG learning");
  }
  @Test (groups= {"Regression"},priority=2)
  public void Test2() {
	  System.out.println("My second method - test2");

  
  
}

  @Test (priority =0)
  public void Test3() {
	  System.out.println("My second method - test2 priority 0");

}
}