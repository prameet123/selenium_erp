import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class android {
    static WebDriver driver;

    public static void main(String arr[]) throws MalformedURLException, InterruptedException {
        File app = new File("C:\\Users\\pr\\Downloads\\Eapro_LeadGeneration_240918_9P.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "33007198a56d23cd");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.findElement(By.id("edittxt_phone")).sendKeys("9985432568");
      /*  try {
            Runtime.getRuntime().exec("cmd /K cd " + "../libs/android-sdk-windows/platform-tools");
            Runtime.getRuntime().exec("cmd /C adb shell input keyevent 4");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        driver.findElement(By.id("edittxt_password")).sendKeys("111");
      try {
            Runtime.getRuntime().exec("cmd /K cd " + "../libs/android-sdk-windows/platform-tools");
            Runtime.getRuntime().exec("cmd /C adb shell input keyevent 4");
        } catch (Exception e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Double> swipeObject = new HashMap<String, Double>();
        swipeObject.put("startX", 0.50);
        swipeObject.put("startY", 0.95);
        swipeObject.put("endX", 0.50);
        swipeObject.put("endY", 0.01);
        swipeObject.put("duration", 3.0);
        js.executeScript("mobile: swipe", swipeObject);
       driver.findElement(By.id("btn_login")).click();

    }
}