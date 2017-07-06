package LoginSuite;

import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;


/**
 * Created by Ashish on 06-07-2017.
 */
public class UITest extends BaseTest {

    @Test
    @Title("Login Functionality")
    @Description("Checking login with correct credentials.")
    public void login(){
        objLogin.login("username","password");
    }
}
