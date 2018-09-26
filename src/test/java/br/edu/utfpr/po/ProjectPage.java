package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectPage extends RedMineBasePage {
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/a[1]")
    private WebElement newProjectLink;
    
    
    public ProjectPage(WebDriver driver) {
        super(driver);
    }
    
    public NewProjectPage goToNewProject() {
        newProjectLink.click();
        return new NewProjectPage(driver);
    }
    
}
