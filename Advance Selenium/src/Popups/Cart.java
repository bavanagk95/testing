package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("cerelac");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Nestle Cerelac Wheat Cereal']")).click();
		Thread.sleep(2000);
		
		/**/
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String> lis=new ArrayList<String>(allid);
		String id=lis.get(1);
		driver.switchTo().window(id);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('pincodeInputId').value='560054'");*/
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("560054");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();

	}

}
