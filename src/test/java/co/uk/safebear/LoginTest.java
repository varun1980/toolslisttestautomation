package co.uk.safebear;

import co.uk.safebear.pages.LoginPage;
import co.uk.safebear.pages.ToolsPage;
import co.uk.safebear.utils.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import sun.rmi.runtime.Log;

public class LoginTest {

    WebDriver browser;
    LoginPage loginPage;
    ToolsPage toolspage;

    @Before
    public void setup(){
        browser = Driver.getDriver();
        loginPage = new LoginPage(browser);
        toolspage = new ToolsPage(browser);
        browser.navigate().to(Driver.getUrl());

    }

    @After
    public void teardown()
    {
        browser.quit();

    }

    @Test
    public void successfulLoginTest(){

        Assert.assertEquals("Login Page",loginPage.getPageTitle());

        loginPage.enterUsername("tester");
        loginPage.enterPassword("letmein");
        loginPage.clickSubmitButton();

        Assert.assertEquals("Login Successful",toolspage.checkForSuccessfulLoginMessage());
    }



    @Test
    public void unsuccessfulLoginTest(){

        Assert.assertEquals("Login Page",loginPage.getPageTitle());

        loginPage.enterUsername("wer");
        loginPage.enterPassword("sd");
        loginPage.clickSubmitButton();

        Assert.assertEquals("WARNING: Username or Password is incorrect",loginPage.checkForFailedLoginMessage());
    }


}
