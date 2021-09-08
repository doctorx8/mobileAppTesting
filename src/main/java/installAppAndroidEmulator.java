import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class installAppAndroidEmulator {
   static DesiredCapabilities dc=new DesiredCapabilities();
   static AndroidDriver<WebElement> driver;
    static URL url;
static public void setUpDesiredCapabilities(String apkPath)  {
    dc=new DesiredCapabilities();
    dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
    dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
    dc.setCapability(MobileCapabilityType.BROWSER_VERSION,9.0);
    dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
    dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\xuekr\\Downloads\\"+apkPath);
    try {
        url=new URL("http://localhost:4723/wd/hub");
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
    driver=new AndroidDriver<>(url,dc);
}

}
