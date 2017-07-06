package NavigationSuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import resources.LogUtil;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by Ashish on 06-07-2017.
 */
public class MyNetworkNavigationTest extends BaseTest {

    @Test
    @Title("Navigation-My Network")
    @Description("Navigating to My Network")
    public void myNetwork(){
        objNavigate.clickMyNetwork();
        boolean status = objNetworkPage.verifyPage();
        Assert.assertTrue(status);
        LogUtil.log("Test Passer: Navigated to My Network page");
    }
}
