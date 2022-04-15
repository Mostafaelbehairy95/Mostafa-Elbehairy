package common;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;



public class BaseTest {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String Actual;

	
	public void setupDriver(String Browser) {
		if(Browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjQ5OTIzMzkwLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");
	}
	
	
	@BeforeMethod
	@Parameters({"Browser"})
	public void beforeMethodMethod(String Browser) {
		setupDriver(Browser);
	}
	
	@AfterMethod
	public void afterMethodMethod() throws InterruptedException {
		driver.close();
	}
	
	@DataProvider
	public String[][] gdata(Method m) throws IOException {
		String[][] obj = null;
		obj = dataDriven.getData(m.getName());
		return obj;
	}
	
	
	

}
