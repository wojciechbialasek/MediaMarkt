import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AutomatedTestMediaMarkt {

    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("https://mediamarkt.pl/");
    }

    @Test
    public void asUserITryToFindeMacBookPro() {

        FirstPage searchingBar = new FirstPage(driver);
        searchingBar.SearchMacBook();
        searchingBar.ClickOnLoup();



    }



    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}