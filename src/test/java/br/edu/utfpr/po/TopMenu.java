package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author andreendo
 */
public class TopMenu extends BasePage {
    
    @FindBy(xpath = "//*[@id=\"top-menu\"]/ul/li[3]/a")
    private WebElement helpLink;
    
    public TopMenu(WebDriver driver) {
        super(driver);
    }
    
    public HelpPage goToHelp() {
        helpLink.click();
        return new HelpPage(driver);
    }
   
    private void clickMenuOption(WebElement menuOption) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until( ExpectedConditions.elementToBeClickable(menuOption) );
        menuOption.click();
    }
}
