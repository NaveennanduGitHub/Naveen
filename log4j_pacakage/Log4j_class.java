package log4j_pacakage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4j_class {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		Logger logger = Logger.getLogger("google search");
		PropertyConfigurator.configure("Log4j.properties");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\OneDrive\\Documents\\chrome\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		logger.info("lonuch chrome browser");
		Thread.sleep(2000);
		logger.info("wait for 2 second");
		driver.get("https://www.google.com/");
		logger.info("open the google");
		Thread.sleep(3000);
		logger.info("wait for 3 seconds");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Quality assurance");
		logger.info("open the QA");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
		logger.info("open the chrome enter");
		driver.quit();
		
		
		
		
		
		
		
		

	}
}
