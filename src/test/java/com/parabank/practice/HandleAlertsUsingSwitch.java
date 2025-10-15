package com.parabank.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertsUsingSwitch {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		// Normal Alert -- Ok button
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		// Conformation Alert -- Ok and Cancel Button 
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		driver.switchTo().alert().accept();
	//	driver.switchTo().alert().dismiss();
		
		// Prompt Alert Box 
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		driver.switchTo().alert().sendKeys("Welcome");
		driver.switchTo().alert().accept();
	}

}
