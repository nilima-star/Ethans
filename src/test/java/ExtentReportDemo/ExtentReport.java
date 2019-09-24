package ExtentReportDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
		 * driver.get("https://www.facebook.com"); driver.quit();
		 */		
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("C:\\Users\\admin\\Downloads\\screenshot\\batch.html");
		ExtentReports report= new ExtentReports();
		report.attachReporter(htmlReporter);
		ExtentTest logger=report.createTest("Aut_01_VerifyLogin","User is able to login successfully");
		logger.log(Status.PASS,"Username entered successfully in textbox");
		logger.log(Status.PASS,"Password entered successfully in textbox");
		logger.log(Status.FAIL,"Unable to click login button");
		logger.log(Status.INFO,"Home page is not displayed");
	
		report.flush();
	}
	

}
