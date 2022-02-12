package variousConsepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {
	WebDriver driver;

	@Before
	public void launchBrowser() {
		// Create Object and set property
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		// set URl
		driver.get("https://objectspy.space/");
		// Maximize
		driver.manage().window().maximize();
		// Delete Cookies
		driver.manage().deleteAllCookies();
		// defile Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void learnElementLocateor() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("selenium");

		// Upload file if you have INPUT tag
		// Other than INPUT use Robot class

		driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\Kevadia\\QASeptember2021\\Session2");
		// Link Text
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		// wait
		//Thread.sleep(6000);
		// navigate back
		//driver.navigate().back();
		// Partial Link Text
		// driver.findElement(By.partialLinkText("TF-API")).click();
		//driver.findElement(By.partialLinkText("Product")).click();
        // CSS Selector
		//Element identification
		driver.findElement(By.cssSelector("input#sex-0")).click();
		// driver.findElement(By.cssSelector("input[value = '3']")).click();
		driver.findElement(By.cssSelector("input[type='radio'][id='exp-3']")).click();
		
		//xPath
		//Absolute
		//driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("selenium is fun");
		//Relative
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("selenium is fun");
		driver.findElement(By.xpath("//input[@value='Selenium Webdriver' and @name='tool'and @id='tool-2']")).click();
		//driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
		//or
		driver.findElement(By.xpath("//strong[contains(text(),'Link Test : New Page')]")).click();
		
	}
    public void tearDown(){
    	driver.close();	
    	//driver.quit();
		
	}

}
