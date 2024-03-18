import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class  PIMTestRunner extends Setup{
    @BeforeTest
    public void doLogin(WebDriver driver){
        LoginPage LoginPage=new LoginPage(driver);
        LoginPage.doLogin("admin","admin123");
        WebElement imgProfile= driver.findElement(By.className("oxd-userdropdown-img"));
        Assert.assertTrue(imgProfile.isDisplayed());
    }


    @Test
    public void emplyeeRegistration() throws InterruptedException {
        PIMPage pimPage=new PIMPage(driver);
        String firstName="Istiak";
        String  lastName="ahasan";
        String userName="istiak123";
        String password="password";
        pimPage.registerUser(firstName,lastName,userName,password);
        Utils.doScroll(driver,0,300);
        Thread.sleep(7000);
        Utils.saveUsers(firstName,lastName,userName,password);

    }
}
