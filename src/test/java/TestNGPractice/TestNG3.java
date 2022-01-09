package TestNGPractice;

import org.testng.annotations.Test;

public class TestNG3 {
  @Test
  public void a_Test1() {
	  System.out.println("Welcome to TestNG learning");
  }
  @Test
  public void b_Test2() {
	  System.out.println("My second method - test2");
  
  
}

  @Test
  public void c_Test3() {
	  System.out.println("My third method - test3 ");
add();
}
  public static void add()
  {int a=10,b=20;
  System.out.println(a+b);
  }
}