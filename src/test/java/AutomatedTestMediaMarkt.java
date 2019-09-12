import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomatedTestMediaMarkt {

    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("https://mediamarkt.pl/");
        driver.manage().window().maximize();
    }

    @Test
    public void asUserITryToFindeMacBookPro() {

        MainPage searchingMacBook = new MainPage(driver);
        searchingMacBook.SearchMacBook();
        searchingMacBook.ClickOnLoupe();

        SecondPage sorting = new SecondPage(driver);
        sorting.Sort();
        sorting.ChoosePriceDesc();
        sorting.SelectItem();

        ThirdPage buying = new ThirdPage(driver);
        buying.Basket();

        FourthPage enterPostCode = new FourthPage(driver);
        enterPostCode.EnterPostCode();
        enterPostCode.ClickSave();
        enterPostCode.CheckText();
    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}