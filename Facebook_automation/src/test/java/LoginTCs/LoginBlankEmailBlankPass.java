package LoginTCs;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import common.BaseTest;

public class LoginBlankEmailBlankPass extends BaseTest {
	
	@Test(dataProvider = "gdata")
	public void Login_blankEmail_blankPass(String Test_cases,String first,String last,String Email,String Confirm_Email, 
			String Password, String DateDay,String DateMonth,String DateYear, String Gender) {
		BaseTest.driver.findElement(By.id("email")).sendKeys(Email);
		BaseTest.driver.findElement(By.id("pass")).sendKeys(Password);
		BaseTest.driver.findElement(By.id("loginbutton")).click();
		
		BaseTest.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div[1]")));
		BaseTest.Actual = BaseTest.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div[1]")).getText();
		assertEquals(BaseTest.Actual, "Wrong credentials\nInvalid username or password");

		}

}
