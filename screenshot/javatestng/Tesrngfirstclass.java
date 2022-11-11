package javatestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Tesrngfirstclass {
	WebDriver driver;

	@Test(priority = 0, enabled = false)
	public void gogole() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"))
				.sendKeys("Naveennandu" + Keys.ENTER);
		Thread.sleep(5000);

	}

	@Test(priority = 1, enabled = false)
	public void facebook() throws InterruptedException {
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("8185979062");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("7288014576");
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).sendKeys("Naveen@2002");
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		Thread.sleep(3000);

	}

	@Test(priority = 2, enabled = true)
	public void selenium() {
		driver.get("https://www.facebook.com/");
		new Select(driver.findElement(By.xpath("//*[@id=\"day\"]"))).selectByVisibleText("20");
	}

	@Test(enabled = false)
	public void whatsapp() {
		driver.get("https://www.whatsapp.com/");
		driver.findElement(
				By.xpath("//*[@id=\"top-of-page\"]/div[1]/div[1]/div[1]/header/div/div[2]/span[1]/a[1]/span/h5"))
				.click();

	}

	@Test(priority = 2, enabled = false)
	public void youtube() {
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("seetharamam");
		

	}

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	
		

	}

}
