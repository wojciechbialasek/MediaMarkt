import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ThirdPage {
    private WebDriver driver;
    CssSelector cssSelector = new CssSelector();

    public ThirdPage(WebDriver driver){
        this.driver = driver;
    }

    public void Basket(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("window.scrollBy(0,1000)");

        WebElement basket = driver.findElement(By.cssSelector(cssSelector.Basket));
        basket.click();
    }
}
