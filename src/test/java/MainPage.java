import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;
    CssSelector cssSelector = new CssSelector();

    public MainPage(WebDriver driver){

        this.driver = driver;
    }

    public void SearchMacBook(){

        WebElement search = driver.findElement(By.cssSelector(cssSelector.SearchMacBook));
        search.sendKeys("MacBook Pro");
    }

    public void ClickOnLoupe(){
        WebElement loupe = driver.findElement(By.cssSelector(cssSelector.Loupe));
        loupe.click();
    }
}
