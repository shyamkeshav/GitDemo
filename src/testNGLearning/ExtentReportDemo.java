package testNGLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	ExtentReports reports;
	
	@Test
	public void DemoLaunch()
	{
		reports.createTest("FirstTest");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\eclipse-workspace\\Automation\\Drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		reports.flush();	
	}
	
	@BeforeTest
	public void Demo()
	{
		String path = "C:\\Users\\User\\eclipse-workspace\\testNGLearning\\Reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		 reports = new ExtentReports();
		reporter.config().setReportName("WebApp Testing Report");
		reporter.config().setDocumentTitle("DemoLaunch Results");
		reports.attachReporter(reporter);
		reports.setSystemInfo("Tester","Shyam");
	}

}
