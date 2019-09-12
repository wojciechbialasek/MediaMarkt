import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FourthPage {
    private WebDriver driver;
    CssSelector cssSelector = new CssSelector();

    public FourthPage(WebDriver driver){
        this.driver = driver;

    }
    public void EnterPostCode(){
        WebElement postCode = driver.findElement(By.cssSelector(cssSelector.PostCode));
        postCode.sendKeys("40018");
        }

     public void ClickSave(){
        WebElement saveButton = driver.findElement(By.cssSelector(cssSelector.SaveButton));
        saveButton.click();
     }

    public void CheckText(){
        WebElement text = driver.findElement(By.cssSelector(cssSelector.MessageText));
        String textMessage = text.getText();
        Assert.assertEquals(textMessage,"12 278,10 zł");
    }
}
