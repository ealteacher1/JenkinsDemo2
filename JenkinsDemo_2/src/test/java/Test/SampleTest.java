package Test;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class SampleTest extends BaseClass {
  @Test
  public void testCase1() {
	  System.out.println("this is Test1");
	  System.out.println("Hello shams3");
	  System.out.println();
  }
  
  
  @Test
  public void testCase2() {
	  System.out.println("this is Test2");
	  int x =5;
  }
  
  @Test
  public void testCase3() {
	  System.out.println("this is Test3");
  }
  
  
}
