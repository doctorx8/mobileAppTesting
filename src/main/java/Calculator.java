import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
        dc.setCapability("appPackage","com.android.calculator2");
        dc.setCapability("appActivity","com.android.calculator2.Calculator");
        URL url=new URL("http://localhost:4723/wd/hub");
        AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
        Thread.sleep(5000);

    }
}
