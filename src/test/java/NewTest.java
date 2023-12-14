import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
	String title;
  @Test(groups= {"smoke"})
  public void f() {
	  title=driver.getTitle();
  }
  @BeforeMethod(groups= {"smoke"})
  public void beforeMethod() {
	   driver=new  ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }

  @AfterMethod(groups= {"smoke"})
  public void afterMethod() {
	  if(title.equals("OrangeHRM"))
	  {
		  System.out.println("valid");
	  }
	  else {
		  System.out.println("not valid");
	  }
	  driver.close();
  }

}
