
package com.selenium.Projecr2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest4 {
	 @Test(invocationCount=3)
	  public void f() {
		  System.out.println("Firsttest case execution");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("  before test case execution");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("after test case execution");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  
		  System.out.println("before class case execution");
	  }
	  

	  @AfterClass
	  public void afterClass() {
		  System.out.println("after class case execution");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("beforetest  execution");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("after test execution");
	  }
	  
	  @Test
	  public void beforeSuite() {
		  System.out.println("test case 2");
		  Assert.fail();
	  }

	  @Test(timeOut=1000,alwaysRun=true,dependsOnMethods= {"beforeSuite"})
	  public void afterSuite() throws InterruptedException {
		  
		  System.out.println("test case 3 execution");
		  //Thread.sleep(5000);
	  }
}
