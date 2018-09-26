package br.edu.utfpr;

import br.edu.utfpr.po.HomePage;
import br.edu.utfpr.po.LoginPage;
import br.edu.utfpr.po.NewProjectPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewProjectTest {
    
    private WebDriver driver;
    
    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }
    
    @Before
    public void before() {
        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("headless");
        chromeOptions.addArguments("window-size=1200x600");
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);     
    }
    
    @After
    public void after() {
        driver.close();
    }    
    
    /**
     * 
     */
    @Test
    public void testNewProject() {
        HomePage homePage = new HomePage(driver);       
        LoginPage loginPage = homePage.getTopMenu().goToLogin();
        loginPage.login("guimpo", "teste");
        NewProjectPage newProjectPage = loginPage.getTopMenu().goToProjects().goToNewProject();
        newProjectPage.creteNewProject("yopi", "yopi");
        assertEquals("Successful creation.", newProjectPage.getNotice());
    }    
}
