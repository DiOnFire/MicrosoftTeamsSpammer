package me.dion.teamsspammer.bot;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Bot {
    private WebDriver driver;
    private String website, name, driverFile, video;

    public Bot(String website, String name, String driverFile, String video) {
        this.website = website;
        this.name = name;
        this.driverFile = driverFile;
        this.video = video;
        System.setProperty("webdriver.chrome.driver", driverFile);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("use-fake-ui-for-media-stream");
        options.addArguments("--use-fake-device-for-media-stream");
        options.addArguments("--use-file-for-fake-video-capture=C:\\Users\\DiOnFire\\Downloads\\ffmpeg-n5.0-latest-win64-lgpl-5.0\\bin\\output.y4m");
        options.addArguments("--headless");
        this.driver = new ChromeDriver(options);
    }

    public void connect() {
        driver.get(website);
        List<WebElement> buttons = driver.findElements(new By.ByTagName("button"));
        try {
            buttons.get(1).click();
        } catch (Exception ignored) {
        }
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(new By.ByName("username")));
        element.sendKeys(name);
        driver.findElements(new By.ByTagName("button")).get(0).click();
    }

    public void disconnect() {
        driver.quit();
    }

    public void toggleCamera() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(new By.ById("video-button"))).click().build().perform();
    }

    public void enableMicrophone() {
        driver.findElement(new By.ById("microphone-button")).click();
    }

    public void disableMicrophone() {
        driver.findElement(new By.ById("microphone-button")).click();
    }

    public String getName() {
        return this.name;
    }
}
