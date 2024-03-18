import jdk.internal.access.JavaIOFileDescriptorAccess;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    private final WebDriver driver;
    @FindBy(name="username ")
    WebElement txtUsername;

    @FindBy(name="password")
    WebElement txtpassword;

    @FindBy(css="[type=\"submit\"]")
    WebElement btnlogin;

    @FindBy(css="[role=\"menuitem\"]")
    List<WebElement> btnLogout;
    @FindBy(className="oxd-userdropdown-name")
    WebElement loggedinUser;
    WebDriver dreiver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void doLogin(String username,String password){
        txtUsername.sendKeys(username);
        txtpassword.sendKeys(password);
        btnlogin.click();
    }

    public void doLogout(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.loggedinUser.click();
        loginPage.btnLogout.get(3).click();
    }
}
