
package br.edu.utfpr.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewProjectPage extends ProjectPage {
    
    private WebElement project_name;
    private WebElement project_identifier;
    
    @FindBy(xpath = "//*[@id=\"new_project\"]/input[3]")
    private WebElement createBtn;
    
    private WebElement flash_notice;
    
    public NewProjectPage(WebDriver driver) {
        super(driver);
    }
    
    public NewProjectPage creteNewProject(String name, String id) {
        project_name.sendKeys(name);
        project_identifier.sendKeys(id);
        createBtn.click();
        return this;   
    }
    
    /**
     *
     * @return Successful creation.
     */
    public String getNotice() {
        return driver.findElement(By.id("flash_notice")).getText().trim();
    }
    
}
