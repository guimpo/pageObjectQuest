package br.edu.utfpr.po;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelpPage extends RedMineBasePage {
        
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/ul[2]")
    private WebElement installingList;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/ul[7]/li[1]/a")
    private List<WebElement> gettingStartedList;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/ul[2]/li[1]/a")
    private WebElement installingLink;  
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/ul[1]")
    private WebElement sumario;
    
    public HelpPage(WebDriver driver) {
        super(driver);
    }
    
    /**
     * 
     * @return 4
     */
    public int getinstallingListSize() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until( ExpectedConditions.elementToBeClickable(installingLink) );
        return installingList.findElements(By.tagName("li")).size();
    }
    
    /**
     *
     * @return 6
     */
    public int getGettingStartedListSize() {
        return gettingStartedList.size();
    }
    
    public String getUrl() {
        return driver.getCurrentUrl();
    }


}