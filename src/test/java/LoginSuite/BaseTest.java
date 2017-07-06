package LoginSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.LogUtil;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;
import pages.*;

/**
 * Created by Ashish on 06-07-2017.
 */
public class BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    LoginPage objLogin;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/selenium-java-3.4.0/chromedriver.exe");
        driver = new ChromeDriver();
        objLogin = new LoginPage(driver);
        driver.get("https://www.linkedin.com/");
        wait = new WebDriverWait(driver,50);
    }

    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
