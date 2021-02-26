package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleOdometersPage extends BasePage {

    @FindBy(xpath = "//tbody/tr[1]")
    public WebElement firstRowOfThePage;
}
