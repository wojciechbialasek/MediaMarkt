import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstPage {
    private WebDriver driver;
    CssSelector cssSelector = new CssSelector();

    public FirstPage(WebDriver driver){
        this.driver = driver;
    }

    public void SearchMacBook(){

        WebElement search = driver.findElement(By.cssSelector(cssSelector.SearchBar));
        search.sendKeys("MacBook Pro");
    }

    public void ClickOnLoup(){
        WebElement loup = driver.findElement(By.cssSelector(cssSelector.Loup));
        loup.click();
    }
}
