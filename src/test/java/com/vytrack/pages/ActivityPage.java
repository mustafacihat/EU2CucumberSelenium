package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityPage extends BasePage {


    @FindBy(xpath = "//li[.='Activity']")
    public WebElement activityButton;

    @FindBy(css = "div.filter-item.oro-drop>div")
    public WebElement activityTypeButton;

    @FindBy(xpath = "(//b[@class='filter-criteria-hint'])[1]")
    public WebElement activityTextField;


    public void checkAllActivityTypes(){
        for (int i = 2; i <=6 ; i++) {
            String path = "(//label/input)["+i+"]";
            WebElement checkBox = Driver.get().findElement(By.xpath(path));
            checkBox.click();
            BrowserUtils.waitFor(1);
        }
    }

}
