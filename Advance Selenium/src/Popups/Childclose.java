package Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Childclose {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='New Window']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='New Window Message']")).click();
		Thread.sleep(2000);
		Set<String> allid = driver.getWindowHandles();
		Thread.sleep(2000);
		for(String id:allid)
		{
			driver.switchTo().window(id);
			Thread.sleep(2000);
			driver.close();
		}

	}

}
