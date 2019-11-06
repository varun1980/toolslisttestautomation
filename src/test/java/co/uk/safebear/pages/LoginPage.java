package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.LoginPageLocators;
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
            browser.findElement(locators.getUsernameLocator()).sendKeys(username);
        }
    public void enterPassword (String password){
                browser.findElement(locators.getPasswordLocator()).sendKeys(password);
            }
     public void clickSubmitButton (){
        browser.findElement(locators.getLogingButton()).click();
     }
     public String checkForFailedLoginMessage(){
        return browser.findElement(locators.getFailedLogingMessage()).getText();
     }
}
