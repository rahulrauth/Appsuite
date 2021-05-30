package com.android.settings;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Lib {
	
	

	
	public static  AndroidDriver<MobileElement>  getDriver()  {
	
	AndroidDriver<MobileElement> driver = null;
	
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("platformName", "Android");
	caps.setCapability("platformVersion", "10.0");
	caps.setCapability("udid", "emulator-5554");
	caps.setCapability("appPackage", "com.riviera.indifi.app");
	caps.setCapability("appActivity", ".MainActivity");
	caps.setCapability("autoGrantPermissions", "true");
	caps.setCapability("noReset", "false");


	URL url = null;
	try {
		url = new URL("http://127.0.0.1:4723/wd/hub");
		System.out.println("Driversssssss");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return driver = new AndroidDriver<MobileElement>(url, caps);
	
	
	
}
	

}
