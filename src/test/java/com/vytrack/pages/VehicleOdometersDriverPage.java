package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleOdometersDriverPage extends BasePage {

    @FindBy(css = "a[title='Add attachment']")
    public WebElement addAttachmentButton;

    @FindBy(xpath = "//input[contains(@id,'oro_attachment_file_file-uid')]")
    public WebElement chooseFile;

    @FindBy(css = "button[type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//textarea[@name='oro_attachment[comment]']")
    public WebElement commentInputBox;

    @FindBy(css = ".message")
    public WebElement successMessage;

}
