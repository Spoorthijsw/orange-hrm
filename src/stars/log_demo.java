package stars;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class log_demo {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		Logger log = Logger.getLogger(log_demo.class);
		log.info("browser is launchimg");
	//	System.setProperty("webdriver.chrome.driver", "E:\\Automatioin\\chromedriver.exe");
			driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.get("https://www.redbus.in");
		 log.info("url is launching");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.id("src")).sendKeys("Banglore",Keys.ENTER);
		 log.error("*******no such element found****");
		 log.debug("Hello this is debug message");
		 driver.findElement(By.id("")).sendKeys("dest",Keys.ENTER);
		 
		 log.fatal("This is fatal message");
		 
		 log.error("fchbfyclwauhfbf");
		
		 
	}

}
