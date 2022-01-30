package me.dion.teamsspammer.bot;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class BotManager {
    private final ArrayList<Bot> bots = new ArrayList<>();
    private final WebDriver driver;
    private final String url, d;

    public BotManager(WebDriver driver, String url, String d) {
        this.driver = driver;
        this.url = url;
        this.d = d;
    }

    public void createBots(short count) {
        for (short i = 0; i < count; i++) {
            bots.add(new Bot(driver, url, "BOT " + i, d));
        }
    }

    public void connect() {
        bots.forEach(Bot::connect);
    }

    public void disconnect() {
        bots.forEach(Bot::disconnect);
    }
}
