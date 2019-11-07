package co.uk.safebear.utils;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//Driver
public class Driver {

    // variable that stores the URL
    private static final String URL = System.getProperty("url", "http://toolslist.safebear.co.uk:8080");
    // variable that stores the Browser
    private static final String BROWSER = System.getProperty("browser", "chrome");


    public static String getUrl() {
        //getter method to return URL
        return URL;
    }

    public static WebDriver getDriver() {

        ChromeOptions chromeOptions;

        switch (BROWSER.toUpperCase()) {

            case "CHROME":


                //Tell the user which browser we're running our tests on
                System.out.println("Executing on CHROME");

                //Use 'WebDriverManager' to setup our chromedriver
                WebDriverManager.chromedriver().setup();

                //Return our Driver
                return new ChromeDriver();

            case "CHROME_HEADLESS":


                //Tell the user which browser we're running our tests on
                System.out.println("Executing on CHROME HEADLESS");

                chromeOptions = new ChromeOptions();

                //Set Chrome to run headlessley
                chromeOptions.addArguments("headless");

                //Make sure the window size is large and maximised
                //So nothing disappears off screeb
                // (even in headless mode!)
                //Use 'WebDriverManager' to setup our chromedriver
                chromeOptions.addArguments("window-size=1920,1080");
                chromeOptions.addArguments("start-maximized");

                //Set up our ChromeDriver
                WebDriverManager.chromedriver().setup();

                //Return our Driver
                return new ChromeDriver(chromeOptions);

            case "FIREFOX":
                //Tell the user which browser we're running our tests on
                System.out.println("Executing on FIREFOX");

                //Use 'WebDriverManager' to setup our firefoxdriver
                WebDriverManager.firefoxdriver().setup();

                //Return our Driver
                return new FirefoxDriver();

            case "IE":
                //Tell the user which browser we're running our tests on
                System.out.println("Executing on IE");

                //Use 'WebDriverManager' to setup our IEDriver
                WebDriverManager.iedriver().setup();

                //Return our Driver
                return new InternetExplorerDriver();


            default:
                throw new IllegalArgumentException("The Browser Type is Undefined");
        }

    }
}