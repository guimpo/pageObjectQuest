package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedMineBasePage extends BasePage {
       
    TopMenu topMenu;
    
    
    public RedMineBasePage(WebDriver driver) {
        super(driver);
        topMenu = new TopMenu(driver);
    }
    
    public TopMenu getTopMenu() {
        return topMenu;
    } 
}
