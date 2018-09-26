package br.edu.utfpr.po;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {
    
    @FindBy(xpath = "//*[@id=\"q\"]")
    private WebElement quickSearch;
    
    
    public Header(WebDriver driver) {
        super(driver);
    }

    public void quickSearch(String q) {
        quickSearch.sendKeys(q);
    }

}
