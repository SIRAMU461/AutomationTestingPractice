package com.parabank.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		driver.manage().window().maximize();
		
		// isDisplayed() 
	    WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	 
	    System.out.println(logo.isDisplayed());
	    
	    // isDisplayed()
	    
	   boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	 
	    System.out.println(status);
	    
	   boolean Status1 =  driver.findElement(By.xpath("//input[@name='q']")).isEnabled();
	   
	   System.out.println(Status1);
	 
	  boolean s = driver.findElement(By.xpath("//button[@id='register-button']")).isEnabled();
	  
	  System.out.println(s);
	  
	  
	  //isSelected()
	  
	   WebElement male = driver.findElement(By.xpath("//input[@value='M']"));
	   
	   WebElement Female = driver.findElement(By.xpath("//input[@value='F']"));
	   
	   
	   //before Selecting 
	   
	   System.out.println("***********before Selecting*************");
	   System.out.println("Male Radio Status :: "+male.isSelected());
	   System.out.println("Female Radio Status :: "+Female.isSelected());
	   
	   
	   //After selecting Male Radio 
	   System.out.println("***********After selecting Male Radio*************"); 
	   male.click();
	   System.out.println("Male Radio Status :: "+male.isSelected());
	   System.out.println("Female Radio Status :: "+Female.isSelected());
	 
	  // After selecting Female Radio 
	   System.out.println("***********After selecting Female Radio *************"); 
	   Female.click();
	   System.out.println("Male Radio Status :: "+male.isSelected());
	   System.out.println("Female Radio Status :: "+Female.isSelected());
	   
	   driver.close();
	  
	}

}
