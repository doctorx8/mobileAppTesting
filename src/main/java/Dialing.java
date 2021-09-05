import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.*;

public class Dialing {

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
        dc.setCapability("appPackage","com.google.android.dialer");
        dc.setCapability("appActivity","com.google.android.dialer.DialtactsActivity");
        URL url=new URL("http://localhost:4723/wd/hub");
        AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
        WebElement fab=driver.findElementById("com.google.android.dialer:id/fab");
        fab.click();
        WebElement zero=driver.findElementById("com.google.android.dialer:id/zero");
        WebElement one=driver.findElementById("com.google.android.dialer:id/one");
        WebElement two=driver.findElementById("com.google.android.dialer:id/two");
        WebElement three=driver.findElementById("com.google.android.dialer:id/three");
        WebElement four=driver.findElementById("com.google.android.dialer:id/four");
        WebElement five=driver.findElementById("com.google.android.dialer:id/five");
        WebElement seven=driver.findElementById("com.google.android.dialer:id/seven");
        WebElement six=driver.findElementById("com.google.android.dialer:id/six");
        WebElement eight=driver.findElementById("com.google.android.dialer:id/eight");
        WebElement nine=driver.findElementById("com.google.android.dialer:id/nine");


        List<WebElement> dialingNumbers = new ArrayList<>();
        dialingNumbers.add(zero);
        dialingNumbers.add(one);
        dialingNumbers.add(two);
        dialingNumbers.add(three);
        dialingNumbers.add(four);
        dialingNumbers.add(five);
        dialingNumbers.add(six);
        dialingNumbers.add(seven);
        dialingNumbers.add(eight);
        dialingNumbers.add(nine);


        String inputNumbers="1235434657";

        for(int i=0;i<=inputNumbers.length()-1;i++){

                dialingNumbers.get(i).click();

        }




    }
}
