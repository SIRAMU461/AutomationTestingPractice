package com.parabank.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//select one check box click
		driver.findElement(By.xpath("//input[@value='sunday']")).click();
		
		
		//select all the check boxes
	 List<WebElement> checkboxes =  driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	 
	      for (WebElement check : checkboxes) {
	    	  
	    	 if(!check.isSelected()) {
	    		 check.click();
	    	 }
	    	 
	    	 if(check.isSelected()) {
	    		 check.click();
	    	 }
	    	 
	      }
	      
	       //select last 3 check boxes 
	      for(int i=4; i<checkboxes.size(); i++) {
	    	 checkboxes.get(i).click();
	      }
	      
	      //selet frist 3 checkboxes 
	      
	      for(int i=0; i<4; i++) {
	    	  checkboxes.get(i).click();
	      }
		
	}

}
