package me.dion.teamsspammer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\DiOnFire\\IdeaProjects\\MicrosoftTeamsSpammer\\driver\\msedgedriver.exe");
        WebDriver dr = new EdgeDriver();
        dr.get("https://teams.microsoft.com/dl/launcher/launcher.html?url=%2F_%23%2Fl%2Fmeetup-join%2F19%3Ameeting_NWM3ZDMyZWUtNGRhNi00MDY1LWEzNTQtMTAyY2I0ZjcyZGYx%40thread.v2%2F0%3Fcontext%3D%257b%2522Tid%2522%253a%2522dcb67d46-35b2-47d7-a41c-5507eb550715%2522%252c%2522Oid%2522%253a%252231a6dde0-d267-420b-bae9-c7a4ce87c85b%2522%257d%26anon%3Dtrue&type=meetup-join&deeplinkId=4a238232-bc4c-49a0-afae-a5f313efee58&directDl=true&msLaunch=true&enableMobilePage=true&suppressPrompt=true");
        List<WebElement> button = dr.findElements(new By.ByTagName("button"));

        button.get(1).click();
        dr.get("https://teams.microsoft.com/dl/launcher/launcher.html?url=%2F_%23%2Fl%2Fmeetup-join%2F19%3Ameeting_NWM3ZDMyZWUtNGRhNi00MDY1LWEzNTQtMTAyY2I0ZjcyZGYx%40thread.v2%2F0%3Fcontext%3D%257b%2522Tid%2522%253a%2522dcb67d46-35b2-47d7-a41c-5507eb550715%2522%252c%2522Oid%2522%253a%252231a6dde0-d267-420b-bae9-c7a4ce87c85b%2522%257d%26anon%3Dtrue&type=meetup-join&deeplinkId=4a238232-bc4c-49a0-afae-a5f313efee58&directDl=true&msLaunch=true&enableMobilePage=true&suppressPrompt=true");
        List<WebElement> button1 = dr.findElements(new By.ByTagName("button"));

        button1.get(1).click();
        dr.get("https://teams.microsoft.com/dl/launcher/launcher.html?url=%2F_%23%2Fl%2Fmeetup-join%2F19%3Ameeting_NWM3ZDMyZWUtNGRhNi00MDY1LWEzNTQtMTAyY2I0ZjcyZGYx%40thread.v2%2F0%3Fcontext%3D%257b%2522Tid%2522%253a%2522dcb67d46-35b2-47d7-a41c-5507eb550715%2522%252c%2522Oid%2522%253a%252231a6dde0-d267-420b-bae9-c7a4ce87c85b%2522%257d%26anon%3Dtrue&type=meetup-join&deeplinkId=4a238232-bc4c-49a0-afae-a5f313efee58&directDl=true&msLaunch=true&enableMobilePage=true&suppressPrompt=true");
        List<WebElement> button2 = dr.findElements(new By.ByTagName("button"));

        button2.get(1).click();
        dr.get("https://teams.microsoft.com/dl/launcher/launcher.html?url=%2F_%23%2Fl%2Fmeetup-join%2F19%3Ameeting_NWM3ZDMyZWUtNGRhNi00MDY1LWEzNTQtMTAyY2I0ZjcyZGYx%40thread.v2%2F0%3Fcontext%3D%257b%2522Tid%2522%253a%2522dcb67d46-35b2-47d7-a41c-5507eb550715%2522%252c%2522Oid%2522%253a%252231a6dde0-d267-420b-bae9-c7a4ce87c85b%2522%257d%26anon%3Dtrue&type=meetup-join&deeplinkId=4a238232-bc4c-49a0-afae-a5f313efee58&directDl=true&msLaunch=true&enableMobilePage=true&suppressPrompt=true");
        List<WebElement> button3 = dr.findElements(new By.ByTagName("button"));

        button3.get(1).click();
        dr.get("https://teams.microsoft.com/dl/launcher/launcher.html?url=%2F_%23%2Fl%2Fmeetup-join%2F19%3Ameeting_NWM3ZDMyZWUtNGRhNi00MDY1LWEzNTQtMTAyY2I0ZjcyZGYx%40thread.v2%2F0%3Fcontext%3D%257b%2522Tid%2522%253a%2522dcb67d46-35b2-47d7-a41c-5507eb550715%2522%252c%2522Oid%2522%253a%252231a6dde0-d267-420b-bae9-c7a4ce87c85b%2522%257d%26anon%3Dtrue&type=meetup-join&deeplinkId=4a238232-bc4c-49a0-afae-a5f313efee58&directDl=true&msLaunch=true&enableMobilePage=true&suppressPrompt=true");
        List<WebElement> button4 = dr.findElements(new By.ByTagName("button"));

        button4.get(1).click();

    }
}
