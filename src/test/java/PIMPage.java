import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PIMPage {
    @FindBy(className="oxd-main-menu-item")
    List<WebElement> menuItems;
    @FindBy(className="oxd-button")
    List<WebElement> button;
    @FindBy (className="OXD-INPUT")
    List<WebElement> inputField;
    @FindBy(className="oxd-switch-input")
    WebElement togglebutton;
    public PIMPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void registerUser(String firstName,String lastName,String userName,String password)
    {
        menuItems.get(1).click();
        button.get(2).click();
        togglebutton.click();

        inputField.get(1).sendKeys("istiak");
        inputField.get(3).sendKeys("Ahasan");
        inputField.get(5).sendKeys("istiak123");
        inputField.get(6).sendKeys("password123");
        inputField.get(7).sendKeys("password123");
        button.get(1).click();
    }
}
