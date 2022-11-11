package naveen;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Alert_configuration_ {
	WebDriver driver;
  @Test
  public void f() {System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.close();
	   
  }
  @BeforeTest
  public void beforeTest() {
  }

}
