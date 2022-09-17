package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest extends BaseClass {
	@Test
	public void LoginValidTest() {
		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");
		Assert.assertTrue(lp.ImageValidationIsDisplayed());
		
		
		
	}
	@Test
	public void InvalidLoginTest() {
		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "test1111");
		Assert.assertTrue(lp.ErrorMessageIsDisplayed());
		
		
	}

}
