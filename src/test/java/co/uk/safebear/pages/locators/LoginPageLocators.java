package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class LoginPageLocators {
    private By usernameLocator =By.xpath(".//input[@id=\"username\"]");

    private By passwordLocator =By.xpath(".//input[@name='psw']");

    private By logingButton = By.xpath(".//button[@id='enter']");

    private By failedLogingMessage = By.xpath(".//p[@id='rejectLogin']/b");
}
