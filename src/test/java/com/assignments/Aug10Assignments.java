package com.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug10Assignments {
	
	public static void main(String[] args) {
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://testautomationpractice.blogspot.com/");
	    
	    driver.manage().window().maximize();
	    
	    
	}

}
