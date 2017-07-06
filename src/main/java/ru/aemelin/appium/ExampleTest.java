package ru.aemelin.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static org.openqa.selenium.remote.CapabilityType.BROWSER_NAME;
import static org.openqa.selenium.remote.CapabilityType.BROWSER_VERSION;

/**
 * Created by dolf on 05.07.17.
 */
public class ExampleTest {

    @Test
    public void simpleTest() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.APP, "/opt/android-sdk/170700005-litebrowser-stable-release-signed.apk");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(BROWSER_NAME, "wvga800");
        capabilities.setCapability(BROWSER_VERSION, "23");
        capabilities.setCapability("version", "23");

        AppiumDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://user1:user1@localhost:4444/wd/hub"), capabilities);
        System.out.println(driver.getPageSource());
        driver.quit();
    }
}