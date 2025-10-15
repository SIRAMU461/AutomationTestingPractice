package com.parabank.practice.mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {
	
	 public static void main(String[] args) {
		 
		 MouseRightClick obj = new MouseRightClick();
		 
		 obj.Rightclick();
	}
	 
	 public void Rightclick() {
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 
		WebElement copytext = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));  
		
		Actions act = new Actions(driver);
		
		// contextClick()  -- mean Right Click 
		//act.contextClick(copytext).perform();
		
		//doubleClick() -- douublc click the Web Element
		act.doubleClick(copytext).perform();
 		
		
		
	
		 
		 
		 
	 }
}
