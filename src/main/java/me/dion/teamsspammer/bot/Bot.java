package me.dion.teamsspammer.bot;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public record Bot(String website, String name, String d) {
    public void connect() {
        System.setProperty("webdriver.chrome.driver", d);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("use-fake-ui-for-media-stream");
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get(website);
        List<WebElement> buttons = driver.findElements(new By.ByTagName("button"));
        try {
            buttons.get(1).click();
        } catch (Exception ignored) {}
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(new By.ByName("username")));
        element.sendKeys(name);
        driver.findElements(new By.ByTagName("button")).get(0).click();
    }

    public void disconnect() {
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
