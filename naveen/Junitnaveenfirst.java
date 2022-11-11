package naveen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Junitnaveenfirst {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() throws InterruptedException {
		driver.get("http://baalabharathi.com/upload-story/");
		driver.findElement(By.xpath("//*[@id=\"text-13263966988\"]")).sendKeys("gunpati");
		driver.findElement(By.xpath("//*[@id=\"text-241482569216\"]")).sendKeys("naveen");
		driver.findElement(By.xpath("//*[@id=\"text-23732060291\"]")).sendKeys("gunapatinaveen2002@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"field-DVYLZM9QELAAq8K\"]")).sendKeys("8185979062");
		driver.findElement(By.xpath("//*[@id=\"field-krP8MPeuzRrukdo\"]")).sendKeys("pudi village");
		driver.findElement(By.xpath("//*[@id=\"field-IQsTTT9SxEPs3LH\"]")).sendKeys("vadamalapet");
		driver.findElement(By.xpath("//*[@id=\"field-2Ngu0gfcgyZYrFE\"]")).sendKeys("Tirupathi");
		driver.findElement(By.xpath("//*[@id=\"field-5vlVJGcSKva7av0\"]")).sendKeys("517551");
		new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByVisibleText("American Samoa");
		driver.findElement(By.xpath("//*[@id=\"textarea-5589244956\"]")).sendKeys("Quality assurance");
		new Select(driver.findElement(By.xpath("//*[@id=\"field-rUN19TKpQsSOX3X\"]"))).selectByValue("Ages 13-18 Years Stories For Reading Book");
		driver.findElement(By.xpath("//*[@id=\"field-SUtF8PwfCXGXx46\"]")).sendKeys("the procces of identifing the bugd an errors in the projrct or product its known as the softweretesting");
		driver.findElement(By.name("button-20216154383")).click();
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
