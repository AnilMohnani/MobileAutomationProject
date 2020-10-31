package mobileTests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstTest {
public static void main(String[] args) throws MalformedURLException {
	
	File f=new File("src");
	File fs=new File(f,"ApiDemos-debug.apk");
	DesiredCapabilities des=new DesiredCapabilities();
	des.setCapability(MobileCapabilityType.DEVICE_NAME, "AnilMobileEmulator");
	des.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	des.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	
	AndroidDriver<AndroidElement> ad=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),des);
}
}
