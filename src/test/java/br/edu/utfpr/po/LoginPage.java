package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends RedMineBasePage {
    
    private WebElement username;
    private WebElement password;
    
    @FindBy(xpath = "//*[@id=\"login-form\"]/form/table/tbody/tr[4]/td[2]/input")
    private WebElement loginBtn;
    
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    
    public HomePage login(String us, String pw) {
        username.sendKeys(us);
        password.sendKeys(pw);
        loginBtn.submit();
        return new HomePage(driver);
    }
    
}
