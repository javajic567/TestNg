package com.selenium.Projecr2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest5 {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
  @Test(dataProvider="Data")
  public void f(@Optional("admin")String name,@Optional("admin")String passd) {
	  driver.findElement(By.name("username")).sendKeys(name);
	  driver.findElement(By.name("password")).sendKeys(passd);
	  driver.findElement(By.className("oxd-button")).click();
  }
  @AfterMethod
  public void close()
  {
	  driver.close();
  }
  @DataProvider(name="Data")
  public Object[][] Data()
  {
	  Object[][] data= {{"admin","admin123"},{"Admin","admin123"}};
	  return data;
  }
}
