package naveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondclass {
	
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//Thread.sleep(1000);
	
	driver.get("https://www.google.com");
	driver.navigate().back();
	//Thread.sleep(2000);
	//driver.navigate().refresh();
	//Thread.sleep(1000);
	driver.navigate().to("https://www.facebook.com");
	driver.navigate().back();
	driver.quit();

	}

}

