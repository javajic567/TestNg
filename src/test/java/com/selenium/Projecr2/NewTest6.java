package com.selenium.Projecr2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest6 {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		
	}
  @Test
  public void f() {
	  System.out.println(driver.getTitle());
  }
}
