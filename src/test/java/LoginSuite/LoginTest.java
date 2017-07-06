package LoginSuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import resources.LogUtil;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;


/**
 * Created by Ashish on 06-07-2017.
 */
public class LoginTest extends BaseTest {

    @Test
    @Title("Login Functionality")
    @Description("Checking login with correct credentials.")
    public void loginCorrect(){
        objLogin.login("ashish.p.deshmukh@gmail.com","Angeldreamy89");
        String url = driver.getCurrentUrl();
        Assert.assertEquals( url, "https://www.linkedin.com/feed/");
        LogUtil.log("Test Passed. Login was successful.");
    }

    @Test
    @Title("Login Functionality")
    @Description("Checking login with incorrect credentials.")
    public void loginIncorrect(){
        objLogin.login("ashish.p.deshmukh@gmail.com","Angeldreamy89");
        String error = objLogin.errorMessage()
        Assert.assertEquals( error, "alert error");
        LogUtil.log("Test Passed. Alert was shown to user");
    }
}
