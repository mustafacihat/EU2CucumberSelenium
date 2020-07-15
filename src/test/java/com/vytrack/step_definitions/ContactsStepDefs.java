package com.vytrack.step_definitions;

import com.vytrack.pages.ContactInfoPage;
import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.DBUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {


    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        LoginPage loginPage = new LoginPage();
        String username = null;
        String password = null;
        switch (userType.toLowerCase()) {
            case "driver":
                username = ConfigurationReader.get("driver_username");
                password = ConfigurationReader.get("driver_password");
                break;
            case "sales manager":
                username = ConfigurationReader.get("sales_manager_username");
                password = ConfigurationReader.get("sales_manager_password");
                break;
            case "store manager":
                username = ConfigurationReader.get("store_manager_username");
                password = ConfigurationReader.get("store_manager_password");
                break;
        }

        loginPage.login(username, password);


    }

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {

        List<String> actualList = BrowserUtils.getElementsText(new DashboardPage().menuOptions);

        Assert.assertEquals("verify menu options", menuOptions, actualList);


    }

    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String, String> userInfo) {
        System.out.println("userInfo = " + userInfo);
        new LoginPage().login(userInfo.get("username"), userInfo.get("password"));

        String expectedName = userInfo.get("firstname") + " " + userInfo.get("lastname");
        String actualName = new DashboardPage().getUserName();

        Assert.assertEquals(expectedName, actualName);

        System.out.println("actualname = " + actualName);
        System.out.println("expectedname = " + expectedName);


    }

    @When("the user clicks the {string} from contacts")
    public void the_user_clicks_the_from_contacts(String email) {

        BrowserUtils.waitFor(2);
             //click the row with email
            new ContactsPage().getContactEmail(email).click();
    }

    @Then("the information should be same with database")
    public void the_information_should_be_same_with_database() {
        //get actual data from UI-GUI-Front -end-Browser-Website(whatever we see)
        ContactInfoPage contactInfoPage = new ContactInfoPage();
        String actualFullname = contactInfoPage.contactFullName.getText();
        String actualEmail = contactInfoPage.email.getText();
        String actualPhone = contactInfoPage.phone.getText();

        System.out.println("actualFullname = " + actualFullname);
        System.out.println("actualEmail = " + actualEmail);
        System.out.println("actualPhone = " + actualPhone);


        //get expected data from database
        String query = "select concat(first_name,' ',last_name) as fullname, e.email, p.phone from orocrm_contact c \n" +
                "join orocrm_contact_email e on c.id = e.owner_id\n" +
                "join orocrm_contact_phone p on e.owner_id = p.owner_id\n" +
                "where e.email = 'mbrackstone9@example.com';";


        //since the result is only one row, we saved in Map<String, Object>
        // if you are dealing with multiple rows, use List<Map<String,Object>>
        Map<String, Object> rowMap = DBUtils.getRowMap(query);

        /*String expetcedFirstname = (String) rowMap.get("first_name");
        String expetcedLastname = (String) rowMap.get("last_name");
        String expectedFullname = expetcedFirstname+ " " + expetcedLastname;*/

        String expectedFullname = (String) rowMap.get("fullname");
        String expectedEmail = (String) rowMap.get("email");
        String expectedPhone = (String) rowMap.get("phone");

        System.out.println("expectedFullname = " + expectedFullname);
        System.out.println("expectedEmail = " + expectedEmail);
        System.out.println("expectedPhone = " + expectedPhone);



        //Compare UI to DB

        Assert.assertEquals(expectedFullname,actualFullname);
        Assert.assertEquals(expectedEmail,actualEmail);
        Assert.assertEquals(expectedPhone,actualPhone);
    }

    @Then("the information {string} should be same with database")
    public void the_information_should_be_same_with_database(String email) {
        //get actual data from UI-GUI-Front -end-Browser-Website(whatever we see)
        ContactInfoPage contactInfoPage = new ContactInfoPage();
        String actualFullname = contactInfoPage.contactFullName.getText();
        String actualEmail = contactInfoPage.email.getText();
        String actualPhone = contactInfoPage.phone.getText();

        System.out.println("actualFullname = " + actualFullname);
        System.out.println("actualEmail = " + actualEmail);
        System.out.println("actualPhone = " + actualPhone);


        //get expected data from database
        String query = "select concat(first_name,' ',last_name) as fullname, e.email, p.phone from orocrm_contact c \n" +
                "join orocrm_contact_email e on c.id = e.owner_id\n" +
                "join orocrm_contact_phone p on e.owner_id = p.owner_id\n" +
                "where e.email = '"+email+"';";


        //since the result is only one row, we saved in Map<String, Object>
        // if you are dealing with multiple rows, use List<Map<String,Object>>
        Map<String, Object> rowMap = DBUtils.getRowMap(query);

        /*String expetcedFirstname = (String) rowMap.get("first_name");
        String expetcedLastname = (String) rowMap.get("last_name");
        String expectedFullname = expetcedFirstname+ " " + expetcedLastname;*/

        String expectedFullname = (String) rowMap.get("fullname");
        String expectedEmail = (String) rowMap.get("email");
        String expectedPhone = (String) rowMap.get("phone");

        System.out.println("expectedFullname = " + expectedFullname);
        System.out.println("expectedEmail = " + expectedEmail);
        System.out.println("expectedPhone = " + expectedPhone);



        //Compare UI to DB

        Assert.assertEquals(expectedFullname,actualFullname);
        Assert.assertEquals(expectedEmail,actualEmail);
        Assert.assertEquals(expectedPhone,actualPhone);
    }


}

/*
* package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //go to login page
        Driver.get().get(ConfigurationReader.get("url"));
        //based on input enter that user information
        String username = null;
        String password = null;

        if (userType.equals("driver")) {
            username = ConfigurationReader.get("driver_username");
            password = ConfigurationReader.get("driver_password");
        } else if (userType.equals("sales manager")) {
            username = ConfigurationReader.get("sales_manager_username");
            password = ConfigurationReader.get("sales_manager_password");
        } else if (userType.equals("store manager")) {
            username = ConfigurationReader.get("store_manager_username");
            password = ConfigurationReader.get("store_manager_password");
        }

        //send username and password
        new LoginPage().login(username, password);
    }

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {

        BrowserUtils.waitFor(2);
        DashboardPage dashboardPage = new DashboardPage();
        //get the list of webelement and convert them to list of string with the help of ready method.
        List<String> actualOptions = BrowserUtils.getElementsText(dashboardPage.menuOptions);

        Assert.assertEquals(menuOptions,actualOptions);
        System.out.println("actualOptions = " + actualOptions);
        System.out.println("menuOptions = " + menuOptions);


    }

    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userInfo) {
        System.out.println("userInfo = " + userInfo);

        new LoginPage().login(userInfo.get("username"),userInfo.get("password"));

        String expectedName=userInfo.get("firstname")+" "+userInfo.get("lastname");
        String actualName=new DashboardPage().getUserName();

        Assert.assertEquals(expectedName,actualName);

        System.out.println("actualname = " + actualName);
        System.out.println("expectedname = " + expectedName);


    }


}
* */
