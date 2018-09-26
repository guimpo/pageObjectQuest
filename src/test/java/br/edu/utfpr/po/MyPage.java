package br.edu.utfpr.po;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyPage extends RedMineBasePage {
        
    private WebElement issueSubject;
    
    public MyPage(WebDriver driver) {
        super(driver);
    }
    
    /**
     *
     * @return Issues assigned to me (1)
     */
    public String getFirstIssue() {
        issueSubject = driver.findElement(By.xpath("//*[@id=\"list-left\"]/div/h3"));
        return issueSubject.getText().trim();
    }
    
    public String getUrl() {
        return driver.getCurrentUrl();
    }


}