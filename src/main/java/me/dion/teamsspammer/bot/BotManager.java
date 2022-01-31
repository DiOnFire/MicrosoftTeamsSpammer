package me.dion.teamsspammer.bot;

import java.util.ArrayList;

public class BotManager {
    private final ArrayList<Bot> bots = new ArrayList<>();
    private final String url, d;

    public BotManager(String url, String d) {
        this.url = url;
        this.d = d;
    }

    public void createBots(short count) {
        for (short i = 0; i < count; i++) {
            bots.add(new Bot(url, "BOT " + i, d, ""));
        }
    }

    public void connect() {
        bots.forEach(Bot::connect);
    }

    public void disconnect() {
        bots.forEach(Bot::disconnect);
    }

    public void toggleMicro() {
        bots.forEach(Bot::enableMicrophone);
    }

    public void toggleCam() {
        bots.forEach(Bot::toggleCamera);
    }
}
