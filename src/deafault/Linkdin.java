package deafault;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;


public class Linkdin {
@Test
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File src = new File("C://PhantonJs//bin//phantomjs//bin//phantomjs.exe");
		System.setProperty("phantomjs.binary.path",src.getAbsolutePath());
		WebDriver driver = new PhantomJSDriver();
		driver.get("https://www.linkedin.com");
		System.out.println("Opening Application URL");
	    WebElement element=driver.findElement(By.xpath("//input[@name='session_key']"));
		element.sendKeys("****");
		System.out.println("login ID opened");
		WebElement element2=driver.findElement(By.xpath("//input[@name='session_password']"));
		element2.sendKeys("****");
		driver.findElement(By.xpath("//input[@class='login submit-button']")).click();
		System.out.println("login sucess");
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,new File("E:\\link.jpg"),true);
	}

}
