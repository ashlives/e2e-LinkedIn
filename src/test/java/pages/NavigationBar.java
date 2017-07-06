package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.LogUtil;

/**
 * Created by Ashish on 06-07-2017.
 */
public class NavigationBar {
    WebDriver driver;

    @FindBy(id = "feed-tab-icon")
    WebElement home;


    @FindBy(id = "mynetwork-tab-icon")
    WebElement myNetwork;

    @FindBy(id = "jobs-tab-icon")
    WebElement jobs;

    @FindBy(id = "messaging-tab-icon")
    WebElement messaging;

    @FindBy(id = "notifications-tab-icon")
    WebElement notifications;

    public NavigationBar(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickHome(){
        home.click();
        LogUtil.log("clicked on Home icon.");

    }

    public void clickMyNetwork(){
        myNetwork.click();
        LogUtil.log("clicked on My Network icon.");
    }

    public void clickJobs(){
        jobs.click();
        LogUtil.log("clicked on Jobs icon.");
    }

    public void clickMessaging(){
        messaging.click();
        LogUtil.log("clicked on Messaging icon.");
    }

    public void clickNotifications(){
        notifications.click();
        LogUtil.log("clicked on Notification icon.");
    }
}
