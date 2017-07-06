package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.*;

/**
 * Created by Ashish on 06-07-2017.
 */
public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "login-email")
    WebElement loginField;

    @FindBy(id = "login-password")
    WebElement passwordField;

    @FindBy(id = "login-submit")
    WebElement loginButton;

    @FindBy(id = "control_gen_1")
    WebElement errorMessage;

    public void login(String username, String password){
        loginField.sendKeys(username);
        LogUtil.log("Userid Entered.");
        passwordField.sendKeys(password);
        LogUtil.log("Password Entered.");
        loginButton.click();
        LogUtil.log("Clicked on Login Button.");
    }

    public String errorMessage(){
        String error = errorMessage.getAttribute("class");
        return(error);
    }
}
