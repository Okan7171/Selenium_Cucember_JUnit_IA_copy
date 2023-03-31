package com.krafttech.steps_defs;

import com.krafttech.pages.LoginPage;
import com.krafttech.utilities.ConfigurationReader;
import com.krafttech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class Login_StepDefs {
   // WebDriver driver=Driver.get();
    LoginPage loginPage=new LoginPage();
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
       // System.out.println("navigate to login page");
       Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user type in Selim's credentials")
    public void the_user_type_in_selim_s_credentials() {
      loginPage.loginMtd();
    }


    @When("The user type in valid credentials: {string} and {string}")
    public void theUserTypeInValidCredentialsAnd(String userEmail, String password) {
        loginPage.loginWithCredentialsMtd(userEmail, password);
    }



}
