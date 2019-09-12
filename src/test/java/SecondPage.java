import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class SecondPage {
    private WebDriver driver;
    CssSelector cssSelector = new CssSelector();

    public SecondPage(WebDriver driver){
        this.driver = driver;
    }

    public void Sort(){
        WebElement sort = driver.findElement(By.cssSelector(cssSelector.Sort));
        sort.click();
    }

    public void ChoosePriceDesc(){
        WebElement price = driver.findElement(By.cssSelector(cssSelector.PriceDesc));
        price.click();

    }

    public void SelectItem(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement item = driver.findElement(By.cssSelector(cssSelector.Item));
        item.click();

    }

}
