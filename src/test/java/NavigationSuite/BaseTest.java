package NavigationSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pages.LoginPage;
import pages.NavigationBar;
import resources.LogUtil;

/**
 * Created by Ashish on 06-07-2017.
 */
public class BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    NavigationBar objNavigate;
    LoginPage objLogin;

    @BeforeSuite
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/selenium-java-3.4.0/chromedriver.exe");
        driver = new ChromeDriver();
        objLogin = new LoginPage(driver);
        objNavigate = new NavigationBar(driver);
        driver.get("https://www.linkedin.com/");
        LogUtil.log("Opened LinkedIn.com");
        objLogin.login("ashish.p.deshmukh@gmail.com","Angeldreamy89");
        String url = driver.getCurrentUrl();
        Assert.assertEquals( url, "https://www.linkedin.com/feed/");
        LogUtil.log("Logged in to LinkedIn");
    }

    @AfterSuite
    public void teardown(){
        driver.close();
    }
}
