import java.net.MalformedURLException;

public class DropDowns extends installAppAndroidEmulator{
    public static void main(String[] args) throws InterruptedException {
       setUpDesiredCapabilities("General-Store.apk");
       Thread.sleep(3000);
       driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
        Thread.sleep(3000);
        driver.findElementsByClassName("android.widget.TextView").get(2).click();


    }
}
