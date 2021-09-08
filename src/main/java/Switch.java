import java.net.MalformedURLException;

public class Switch extends installAppAndroidEmulator {

    public static void main(String[] args) throws InterruptedException {
        setUpDesiredCapabilities("ApiDemos-debug.apk");
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

        Thread.sleep(3000);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Switches\"));");
        driver.findElementByXPath("//android.widget.TextView[@text='Switches']").click();
        Thread.sleep(3000);
        driver.findElementById("io.appium.android.apis:id/monitored_switch").click();
    }
}
