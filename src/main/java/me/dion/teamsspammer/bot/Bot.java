package me.dion.teamsspammer.bot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public record Bot(WebDriver driver, String website, String name) {

    public void connect() {
        driver.get(website);
        List<WebElement> buttons = driver.findElements(new By.ByTagName("button"));
        buttons.get(1).sendKeys("webdriver" + Keys.ENTER);
        buttons.get(1).click();


    }

    public boolean disconnect() {
        return false;
    }

    public boolean enableCamera() {
        return false;
    }

    public boolean disableCamera() {
        return false;
    }

    public boolean enableMicrophone() {
        return false;
    }

    public boolean disableMicrophone() {
        return false;
    }

    public String getName() {
        return this.name;
    }
}
