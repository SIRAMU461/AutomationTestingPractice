package com.parabank.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//get(url) -- open the url in the browser.
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		System.out.println("************************************************************************************************");
		//getCurrentUrl() -- returns the url of the webpage 
	    System.out.println(driver.getCurrentUrl());
		System.out.println("************************************************************************************************");
		
	    //getTitle()-- returns the title of the Webpage.
		System.out.println(driver.getTitle());
		System.out.println("************************************************************************************************");
		
		// getPageSource() -- returns the Page Source Code.
		System.out.println(driver.getPageSource());
		System.out.println("************************************************************************************************");
		
		
		//getWindowHandle() -- returns ID of the single browser window
		System.out.println(driver.getWindowHandle());
		System.out.println("************************************************************************************************");
		
		
		//getWindowHandles() -- returns ID of the multiple browser Windows 
		System.out.println(driver.getWindowHandles());
		System.out.println("************************************************************************************************");
		
	}

}
