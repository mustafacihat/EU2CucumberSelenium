package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.VehiclePage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class GridSettingsStepDefs {

    @Given("the user click on the grid settings button")
    public void the_user_click_on_the_grid_settings_button() {
        new DashboardPage().waitUntilLoaderScreenDisappear();
        new DashboardPage().gridSettingsButton.click();
    }

    @When("write the {string} to quick search input box")
    public void write_the_to_quick_search_input_box(String value) {
       new DashboardPage().gridSettingsInput.sendKeys(value);
    }

    @Then("user should get related {string} information the top of the opening table in grid settings")
    public void user_should_get_related_information_the_top_of_the_opening_table_in_grid_settings(String tableInfo) {
        System.out.println("tableInfo = " + tableInfo);
        System.out.println("new DashboardPage().gridFirstInfo.getText() = " + new DashboardPage().gridFirstInfo.getText());
        Assert.assertEquals("verify the table info",tableInfo, new DashboardPage().gridFirstInfo.getText());
    }


    @Given("the user click on the Select All")
    public void the_user_click_on_the_Select_All() {
        BrowserUtils.clickWithJS(new DashboardPage().selectAllInGridSettings);
    }

    @Then("verify all titles in the grid table are shown")
    public void verify_all_titles_in_the_grid_table_are_shown() {
        System.out.println("Driver.get().findElement(By.xpath(\"(//thead)[3]/tr/th//span[1][14]\")).getText() = " + Driver.get().findElement(By.xpath("((//thead)[3]/tr/th//span[1])[14]")).getText());
        System.out.println(BrowserUtils.getElementsText(new VehiclePage().gridTitleMenu));
        System.out.println(new VehiclePage().gridTitleMenu.size());
    }

}
