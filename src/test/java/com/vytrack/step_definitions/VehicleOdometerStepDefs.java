package com.vytrack.step_definitions;

import com.vytrack.pages.VehicleOdometersDriverPage;
import com.vytrack.pages.VehicleOdometersPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VehicleOdometerStepDefs {


    @Given("the user choose one odometer")
    public void the_user_choose_one_odometer() {
        new VehicleOdometersPage().firstRowOfThePage.click();
    }

    @When("the user click Add Attachment")
    public void the_user_click_Add_Attachment() {
        new VehicleOdometersDriverPage().addAttachmentButton.click();
    }

    @When("the user select one file with comment and click the save button")
    public void the_user_select_one_file_with_comment_and_click_the_save_button() {
        new VehicleOdometersDriverPage().chooseFile.sendKeys("C:\\Users\\Mugetsu\\Desktop\\ScenarioOutline.png");
        new VehicleOdometersDriverPage().commentInputBox.sendKeys("this is a comment for comment box I think the message is very clear");
        new VehicleOdometersDriverPage().saveButton.click();
        BrowserUtils.waitFor(5);
    }

    @Then("the user should get success message")
    public void the_user_should_get_success_message() {
        System.out.println(new VehicleOdometersDriverPage().successMessage.getText());
        Assert.assertEquals("Attachment created successfully", new VehicleOdometersDriverPage().successMessage.getText());
    }
}
