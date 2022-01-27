package me.dion.teamsspammer.bot;

import org.openqa.selenium.WebDriver;

public class Bot {
    private final WebDriver driver;
    private final String website;
    private final String name;

    public Bot(WebDriver driver, String website, String name) {
        this.driver = driver;
        this.website = website;
        this.name = name;
    }

    public boolean connect() {
        return false;
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
