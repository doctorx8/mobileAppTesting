import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;

public class DragDrop extends installAppAndroidEmulator {
    public static void main(String[] args) throws InterruptedException {
        setUpDesiredCapabilities("ApiDemos-debug.apk");
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
        WebElement source=driver.findElementsByClassName("android.view.View").get(0);
        WebElement target=driver.findElementsByClassName("android.view.View").get(1);
        Thread.sleep(3000);
        WebElement text=driver.findElementByClassName("android.widget.TextView");
        TouchAction touchAction=new TouchAction(driver);
        touchAction.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();
        if(text.isDisplayed()){
            System.out.println("dropped!");
        }else {
            System.out.println("nothing");
        }
    }
}
