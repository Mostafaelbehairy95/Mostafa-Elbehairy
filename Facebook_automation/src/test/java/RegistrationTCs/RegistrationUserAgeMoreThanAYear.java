package RegistrationTCs;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import common.BaseTest;

public class RegistrationUserAgeMoreThanAYear extends BaseTest {
	@Test(dataProvider = "gdata")
	public void Registration_UserAgeMoreThanOneYear(String Test_cases,String first,String last,String Email,String Confirm_Email, String Password, String DateDay,String DateMonth,String DateYear, String Gender) {
		//Redirect to Registraion page
		BaseTest.driver.findElement(By.xpath("//*[@id=\"login_link\"]/div[3]/a")).click();
		
		// enter First name Data
		BaseTest.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/"
				+ "div[1]/div[1]/div[1]/div[1]/div/div[1]/input")).sendKeys(first);
		
		// enter Surname Data		
		BaseTest.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/"
				+ "div[1]/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys(last);
		
		// enter Email Data
		BaseTest.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/"
				+ "div[1]/div[2]/div/div[1]/input")).sendKeys(Email);

		// enter Confirmation Email Data
		BaseTest.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/"
				+ "div[1]/div[3]/div/div/div[1]/input")).sendKeys(Confirm_Email);
		
		// enter password
		BaseTest.driver.findElement(By.id("password_step_input")).sendKeys(Password);

		// enter BirthDay
		BaseTest.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/"
				+ "div[1]/div[5]/div[2]/span/span/select[1]/option["+ DateDay +"]")).click();
		
		// enter BirthMonth
		BaseTest.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/"
				+ "div[1]/div[5]/div[2]/span/span/select[2]/option["+ DateMonth +"]")).click();

		// enter birthYear
		BaseTest.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/"
				+ "div[1]/div[5]/div[2]/span/span/select[3]/option["+ DateYear +"]")).click();
		
		// enter Gender
		if(Gender.equalsIgnoreCase("Female") ||Gender.equalsIgnoreCase("female")) {
			BaseTest.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/"
					+ "div[1]/div[7]/span/span[1]/input")).click();
			
		}else if(Gender.equalsIgnoreCase("Male") ||Gender.equalsIgnoreCase("male")){
			BaseTest.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/"
					+ "div[1]/div[7]/span/span[1]/input")).click();
		}
		
		// Click on submit button
		BaseTest.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[10]/button")).click();
		
		BaseTest.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div/div")));
		
		BaseTest.Actual = BaseTest.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div/div")).getText();
		
		assertEquals(BaseTest.Actual, "It looks like you've entered the wrong info. Please make sure that you use your real date of birth.");

	}

}
