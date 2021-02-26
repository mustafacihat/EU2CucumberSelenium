package com.vytrack.step_definitions;

import com.vytrack.pages.ActivityPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.VehiclePage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ActivityStepDefs {

    @Given("the user selects one vehicle randomly")
    public void the_user_selects_one_vehicle_randomly() {
       new VehiclePage().selectRandomVehicleFromGrid();
    }

    @Given("the user click the activity button then click the activity type button")
    public void the_user_click_the_activity_button_then_click_the_activity_type_button() {
        BrowserUtils.waitFor(2);
        new DashboardPage().waitUntilLoaderScreenDisappear();
        new ActivityPage().activityButton.click();
        new ActivityPage().activityTypeButton.click();
        BrowserUtils.waitFor(3);
    }

    @When("the user checks the all checkbox in the activity type")
    public void the_user_checks_the_all_checkbox_in_the_activity_type() {
        new ActivityPage().checkAllActivityTypes();
    }

    @Then("the user should get informations belong to related check boxes such as {string}")
    public void the_user_should_get_informations_belong_to_related_check_boxes_such_as(String checkBoxes) {
        Assert.assertEquals("verify the check boxes", checkBoxes, new ActivityPage().activityTextField.getText());
    }
}
