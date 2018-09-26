package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author andreendo
 */
public class HomePage extends RedMineBasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get("http://demo.redmine.org/");
    }
}
