package deafault;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class Phantomjsdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File src = new File("C://PhantonJs//bin//phantomjs//bin//phantomjs.exe");
		System.setProperty("phantomjs.binary.path",src.getAbsolutePath());
		WebDriver driver = new PhantomJSDriver();
		driver.get("https://en-gb.facebook.com/login/");
		System.out.println("Opening Application URL");
	    WebElement element=driver.findElement(By.xpath("//input[@id='email']"));
		element.sendKeys("****");
		WebElement element2=driver.findElement(By.xpath("//input[@id='pass']"));
		element2.sendKeys("***");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		System.out.println("login sucessful");
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,new File("E:\\projects\\pivotal.jpg"),true);
	}
}
