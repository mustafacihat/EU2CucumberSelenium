package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class ScnarioStepDefs {

    @Given("the user logged in successfully as {string}")
    public void the_user_logged_in_successfully_as(String userType) {
        Driver.get().get(ConfigurationReader.get("url"));

        String username = null;
        String password = null;

        if (userType.equals("driver")){
            username= ConfigurationReader.get("driver_username");
            password= ConfigurationReader.get("driver_password");
        }else if (userType.equals("store manager")){
            username= ConfigurationReader.get("store_manager_username");
            password= ConfigurationReader.get("store_manager_password");
        }else if (userType.equals("sales manager")){
            username= ConfigurationReader.get("sales_manager_username");
            password= ConfigurationReader.get("sales_manager_password");
        }



        new LoginPage().login(username,password);

    }



    @Then("the user should get following options")
    public void the_user_should_get_following_options(List<String> menuOptions ) {

        List<String> actualOptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);

        Assert.assertEquals(menuOptions,actualOptions);

    }

    @When("the user logs in with following info")
    public void the_user_logs_in_with_following_info(Map<String,String> userInfoMap) {

        String username = userInfoMap.get("username");
        String password = userInfoMap.get("password");
        new LoginPage().login(username,password);
        String expectedName = userInfoMap.get("firstname") +" " + userInfoMap.get("lastname");
        Assert.assertEquals(expectedName,new DashboardPage().getUserName());

    }
}
