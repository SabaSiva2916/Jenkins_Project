package org.stepdef;

import org.base.BaseClass;
import org.base.ConfigReader;
import org.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDef extends BaseClass{

	@Given("user is on facebook application")
	public void user_is_on_facebook_application() {

	}

	@When("user enter invalid username and valid password")
	public void user_enter_invalid_username_and_valid_password() {

		LoginPage lp = new LoginPage();
		String username = ConfigReader.getProperty("username");
		String password = ConfigReader.getProperty("password");
		lp.doLogin(username, password);

	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		System.out.println("Login attempt done");

	}

}
