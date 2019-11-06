package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.ToolsPageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class ToolsPage {

    ToolsPageLocators toolsPageLocators = new ToolsPageLocators();

    @NonNull
    WebDriver browser;

public String getPageTitle(){
    return browser.getTitle();
}

public String checkForSuccessfulLoginMessage(){

    return browser.findElement(toolsPageLocators.getSuccessfulLoginMessage()).getText();
}
}

