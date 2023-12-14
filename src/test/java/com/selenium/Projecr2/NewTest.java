package com.selenium.Projecr2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;


public class NewTest {
	SoftAssert s=new SoftAssert();
  @Test
  public void test1() {
	  s.assertTrue(false);
  }
  @Test
  public void test2() {
	  Assert.assertTrue(true);
  }
  
  @Test(timeOut=1000)
  public void test3() throws InterruptedException {
	  Thread.sleep(1000);
	  Assert.assertTrue(true);
  }
  @Test(dependsOnMethods= {"test3"})
  public void test4() {
	 Assert.assertTrue(true);
  }
}
