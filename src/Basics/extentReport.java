package Basics;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReport {
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports reports;
	static String filePath = System.getProperty("user.dir") + "//Reports//" + "basicReport.html";

	@Test
	public static void reportintialise() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		htmlReporter = new ExtentHtmlReporter(filePath);
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		ExtentTest logger = reports.createTest("test1");
		

		if (driver.getTitle().equals("google")) {
			logger.log(Status.PASS, "passed bcoz satsfied");

		} else {
			logger.log(Status.FAIL, "failed due to not satisfied");
			logger.log(Status.ERROR, "error due to no excuted");
		}

		reports.flush();

		ExtentTest logger1 = reports.createTest("equals_ignore");

		if (driver.getTitle().equalsIgnoreCase("google")) {
			logger1.log(Status.PASS, "passed bcoz satsfied");

			try {
				driver.findElement(By.name(""));

			}catch(Exception e) {
				logger1.log(Status.ERROR, e.getMessage());
				try {
					logger1.addScreenCaptureFromPath("C:\\Users\\Nitin\\Desktop\\capture");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			
		} else {
			logger1.log(Status.FAIL, "failed due to not satisfied");
			logger1.log(Status.ERROR, "error due to no excuted");
		}

		reports.flush();

	}

}
