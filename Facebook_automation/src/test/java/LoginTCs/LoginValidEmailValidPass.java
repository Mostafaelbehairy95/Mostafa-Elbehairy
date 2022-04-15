package LoginTCs;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import common.BaseTest;

public class LoginValidEmailValidPass extends BaseTest {
	
	@Test(dataProvider = "gdata")
	public void Login_validEmail_validPass(String Test_cases,String first,String last,String Email,String Confirm_Email, 
			String Password, String DateDay,String DateMonth,String DateYear, String Gender) {
		BaseTest.driver.findElement(By.id("email")).sendKeys(Email);
		BaseTest.driver.findElement(By.id("pass")).sendKeys(Password);
		BaseTest.driver.findElement(By.id("loginbutton")).click();
		
		BaseTest.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[1]/div/div/"
				+ "div[1]/div/div/div[1]/ul/li/div/a/div[1]/div[2]/div/div/div/div/span/span")));
		
		BaseTest.Actual = BaseTest.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/"
				+ "div[1]/ul/li/div/a/div[1]/div[2]/div/div/div/div/span/span")).getText();
		assertEquals(BaseTest.Actual, "Mostafa Elbehairy");
	}
}
