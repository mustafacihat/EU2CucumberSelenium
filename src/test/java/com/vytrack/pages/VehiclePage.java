package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class VehiclePage extends BasePage{

    @FindBy(xpath ="(//thead)[3]/tr/th//span[1]" )
    public List<WebElement> gridTitleMenu;

    public void selectRandomVehicleFromGrid(){
        List<WebElement> allVehicles = Driver.get().findElements(By.xpath("//tbody/tr"));
        Random rn = new Random();
        String path = "//tbody/tr[\"+(rn.nextInt(allVehicles.size()))+\"]/td";
        WebElement vehicle = Driver.get().findElement(By.xpath(path));
        new DashboardPage().waitUntilLoaderScreenDisappear();
        vehicle.click();
    }
}
