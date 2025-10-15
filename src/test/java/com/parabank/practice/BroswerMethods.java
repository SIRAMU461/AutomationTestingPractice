package com.parabank.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroswerMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new  ChromeDriver();
		
		Thread.sleep(5000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Thread.sleep(5000);
		//driver.close();
		driver.quit();
		
	}

}
