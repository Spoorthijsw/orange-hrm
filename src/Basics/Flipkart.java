package Basics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkart {
	
	@Test
	public void flipkart() throws Exception {
		
		WebDriver driver= new ChromeDriver();
		driver.get("http:/flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Actions act= new Actions(driver);
		act.sendKeys("9010963542",Keys.TAB,"mr.balu23",Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("iphone 11",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Apple iPhone 11 (Red, 64 GB)']")).click();
	}

}
