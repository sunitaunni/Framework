package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.format.CellFormat;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	//screenshot,alerts,frames,windows, sync issues, javaScript executor
	
	public static void captureScreenshot(WebDriver driver)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File("./screenshots/"+getCurrentDateTime()+".png"));
			System.out.println("Screenshot captured");
		} catch (Exception e) {
			System.out.println("unable to capture screenshot");
			e.printStackTrace();
		}
	}
	
	public static String getCurrentDateTime() {
		DateFormat customformat= new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate=new Date();
		return customformat.format(currentDate);
	}
	public void handleFrames()
	{
		
	}
	public void handleAlerts()
	{
		
	}
}
