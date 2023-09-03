package com.aiite.basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
public static WebDriver driver;
	
	public static void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	
	public static String getPresentUrl() {
		return driver.getCurrentUrl();
	}

}
