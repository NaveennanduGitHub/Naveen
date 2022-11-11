package screenshot;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Timescreenshot {
	WebDriver driver;
  @Test
  public void f() {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Documents\\Lib\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	  
  }

}
