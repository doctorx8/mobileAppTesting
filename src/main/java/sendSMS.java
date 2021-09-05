import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class sendSMS {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
        dc.setCapability("appPackage","com.google.android.apps.messaging");
        dc.setCapability("appActivity","com.google.android.apps.messaging.ui.conversationlist.ConversationListActivity");
        URL url=new URL("http://localhost:4723/wd/hub");
        AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);

        driver.findElementByClassName("android.widget.FrameLayout").click();
//        driver.findElementById("com.google.android.apps.messaging:id/recipient_text_view").click();
//        driver.findElementById("com.google.android.apps.messaging:id/recipient_text_view").sendKeys("abc");
//        driver.findElementByClassName("LinearLayout").click();
        Thread.sleep(5000);
        driver.findElementById("com.android.contacts:id/icon_alternate").click();
        Thread.sleep(5000);
        driver.findElementById("com.google.android.apps.messaging:id/compose_message_text").sendKeys("appium");
        driver.findElementById("com.google.android.apps.messaging:id/send_message_button_container").click();
        Thread.sleep(5000);
        driver.findElementById("android:id/button1").click();


    }
}
