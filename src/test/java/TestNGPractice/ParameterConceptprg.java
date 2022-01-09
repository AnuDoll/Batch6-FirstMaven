
package TestNGPractice;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;


public class ParameterConceptprg {
 /* @Test
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
add(10, 20);
}*/
	@Test
  @Parameters({"val1","val2"})
  public void add(int v1, int v2)
  {
	int sum = v1+v2;  
  System.out.println("The Addition of these two numbers are " +sum);
  }
}