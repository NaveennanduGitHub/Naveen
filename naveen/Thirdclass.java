package naveen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thirdclass {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\OneDrive\\Documents\\chrome\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redmine.org/login");
		
		driver.findElement(By.id("username")).sendKeys("Naveennandu");
		driver.findElement(By.name("password")).sendKeys("ilove you nandu");
		driver.findElement(By.name("autologin")).click();
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.linkText("Lost password")).click();
		driver.findElement(By.partialLinkText("password")).click();
		List<WebElement>totallinks=driver.findElements(By.tagName("a"));
		System.out.println(totallinks.size());
		//driver.get("chromedriver.chromium.org");
		
		//driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("naveen");
	      
		//driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("naveen");
		
			

		

	}

}
