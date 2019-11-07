package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.LoginPageLocators;
import co.uk.safebear.utils.Waits;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class LoginPage {
    LoginPageLocators locators = new LoginPageLocators();

    @NonNull
    WebDriver browser;

    public String getPageTitle(){

        return browser.getTitle();}

    public void enterUsername (String username){
        Waits.waitForElement(locators.getUsernameLocator(),browser).sendKeys(username);
        }
    public void enterPassword (String password){
                Waits.waitForElement(locators.getPasswordLocator(),browser).sendKeys(password);
            }
     public void clickSubmitButton (){
        Waits.waitForElement(locators.getLogingButton(),browser).click();
     }
     public String checkForFailedLoginMessage(){
        return Waits.waitForElement(locators.getFailedLogingMessage(),browser).getText();
     }
}
