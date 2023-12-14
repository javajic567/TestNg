import  org.testng.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest2 {
	WebDriver driver=null;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   Assert.assertNotNull(driver, "null");
	}
  @Test(priority=0,description="Launch",groups= {"smoke"})
  public void f() {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 System.out.println("launched");
String url=driver.getCurrentUrl();
 //ssertEqual("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login",url);
Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", url);  

  }
  @Test(priority=1,groups= {"smoke"},dependsOnMethods= {"f"},description="Login method")
  public void aogin()
  {
	//  Assert.fail("Break");
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
  }
  @Test(priority=3,description="verifying title",groups= {"smoke"})
  public void get() {
 Assert.assertTrue(driver.getTitle().equals("OrangeHRM"));
  
}
  @AfterClass
  void End()
  {
	  driver.close();
  }
}
