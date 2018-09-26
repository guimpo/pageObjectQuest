package br.edu.utfpr.po;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author andreendo
 */
public class TopMenu extends BasePage {
    
    @FindBy(xpath = "//*[@id=\"top-menu\"]/ul/li[3]/a")
    private WebElement helpLink;
    
    @FindBy(xpath = "//*[@id=\"account\"]/ul/li[1]/a")
    private WebElement loginLink;
    
    private WebElement myPageLink;
    
    public TopMenu(WebDriver driver) {
        super(driver);
    }
    
    public HelpPage goToHelp() {
        helpLink.click();
        return new HelpPage(driver);
    }
    
    public LoginPage goToLogin() {
        loginLink.click();
        return new LoginPage(driver);
    }
    
    public boolean isUserLoggedIn(String us) {
        try {
            WebElement user = driver.findElement(By.id("loggedas"));
            return us.equalsIgnoreCase(user.findElement(By.tagName("a")).getText().trim());
        } catch (NoSuchElementException  e) {
            return false;
        }
    }

}
