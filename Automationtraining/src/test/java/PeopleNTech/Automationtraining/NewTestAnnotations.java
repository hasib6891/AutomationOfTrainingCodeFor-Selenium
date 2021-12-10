package PeopleNTech.Automationtraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestAnnotations {
  @Test
  public void f() {
	  System.out.println("This is test annotaion");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method annotaion");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is AFTER method annotaion");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is BEFORE CLASS annotaion");  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is AFTER CLASS annotaion");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is BEFORE TEST annotaion"); 
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is AFTER TEST annotaion");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is BEFORE SUITE annotaion");
  }
  @Test
  public void f6() {
	  System.out.println("This is 2test annotaion");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is AFTER SUITE annotaion");
  }

}
