package DriverWrapper;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Web {
    private static WebDriver driver = null;

    //@Before
    public void startBrowserFirefox() {
        System.setProperty("webdriver.gecko.driver", "./drivers/GeckoDriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.linkedin.com/home");
        driver.manage().window().maximize();

        
//        DesiredCapabilities caps = DesiredCapabilities.firefox();
//        caps.setCapability("platform","windows 10");
//        caps.setCapability("version", "latest");
//        driver = new FirefoxDriver(caps);

    }


    @Before
    public static void startBrowserChrome() {
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
