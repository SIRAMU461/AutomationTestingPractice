package com.parabank.practice;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		try {
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.xpath("//input[@name ='username']")).sendKeys("Ramu077");
			driver.findElement(By.xpath("//input[@name ='password']")).sendKeys("R@muvenky07");
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			Thread.sleep(5000);
			
			URL myurl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode");
		     driver.navigate().to(myurl);
		     Thread.sleep(5000);
		     driver.navigate().back();
		     Thread.sleep(5000);
		     driver.navigate().forward();
		     Thread.sleep(5000);
		     driver.navigate().back();
		     Thread.sleep(5000);
		     driver.navigate().refresh();
		     
		     System.out.println(driver.getCurrentUrl());
			
			Thread.sleep(10000);
			driver.close();
		
	}  catch(Exception e ) {
		System.out.println("Exception Occur in Login Method");
		 System.out.println("Excpetion Details " + e.getMessage());
		 e.printStackTrace();
	}
	}

}
