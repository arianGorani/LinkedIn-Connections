package DriverWrapper;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Web {
    private static WebDriver driver = null;


    @Before
    public static void openLinkedIn() {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/home");
        driver.manage().window().maximize();

//        String sauceUrl = "https://oauth-arian.gorani-ae229:9401ef4c-8147-4af1-8fc0-bc03eeec2c19@ondemand.us-west-1.saucelabs.com:443/wd/hub";
//
//        DesiredCapabilities caps = DesiredCapabilities.chrome();
//        caps.setCapability("platform","windows 10");
//        caps.setCapability("version", "latest");
//
//
//        try {
//            driver = new RemoteWebDriver(new URL(sauceUrl), caps);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closePage() {
        driver.close();
    }


}
