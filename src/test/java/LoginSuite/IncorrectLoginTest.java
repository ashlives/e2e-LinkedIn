package LoginSuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import resources.LogUtil;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by Ashish on 06-07-2017.
 */
public class IncorrectLoginTest extends BaseTest {

    @Test
    @Title("Unsuccessful Login")
    @Description("Checking login with incorrect credentials.")
    public void loginIncorrect(){
        objLogin.login("ashish.p.deshmukh@gmail.com","Incorrect");
        String error = objLogin.errorMessage();
        Assert.assertEquals( error, "alert error");
        LogUtil.log("Test Passed. Alert was shown to user");
    }
}
