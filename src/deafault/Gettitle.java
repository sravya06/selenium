package deafault;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class Gettitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File src = new File("C://PhantonJs//bin//phantomjs//bin//phantomjs.exe");
		System.setProperty("phantomjs.binary.path",src.getAbsolutePath());
		WebDriver driver = new PhantomJSDriver();
		
		//System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("website opened");
		WebElement element=driver.findElement(By.cssSelector(".gsfi, .lst"));
		element.sendKeys("selenium");
		element.submit();
		System.out.println(driver.getTitle());

		 driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
		 // driver.findElement(By.xpath(""));
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
		  System.out.println(driver.getCurrentUrl());
	    
	   

	}

	}
