package co.uk.safebear.utils;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

    // variable that stores the URL
    private static final String URL = System.getProperty("url", "http://toolslist.safebear.co.uk:8080");
    // variable that stores the Browser
    private static final String BROWSER = System.getProperty("browser", "chrome");


    public static String getUr() {
        //getter method to return URL
        return URL;
    }

    public static WebDriver getDriver() {

        ChromeOptions chromeOptions;

        switch (BROWSER.toUpperCase()) {

            case "CHROME":
                ;

                //Tell the user which browser we're running our tests on
                System.out.println("Executing on CHROME");

                //Use 'WebDriverManager' to setup our chromedriver
                WebDriverManager.chromedriver().setup();

                //Return our Driver
                return new ChromeDriver();

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