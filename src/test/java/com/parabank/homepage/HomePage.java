package com.parabank.homepage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	public static void main(String[] args) {
		
		
	HomePage aboutus = new HomePage();
	
	aboutus.AboutusTest();
	
	}	
		
   public void AboutusTest () {
		
	WebDriver driver = new  ChromeDriver();
	
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	
	driver.manage().window().maximize();
	
    driver.findElement(By.linkText("About Us")).click();
    
    System.out.println("Navigate to : " + driver.getTitle());
    
    System.out.println("Cureent link " + driver.getCurrentUrl());
     
    String title1 =driver.getTitle().toString();
    
         String title ="ParaBank | About Us";
         
         if(title.equals(title1)) {
        	 System.out.println("Test Case Passed");
         }else {
        	 System.out.println("Test case Failed");
         }
	}
   

}
