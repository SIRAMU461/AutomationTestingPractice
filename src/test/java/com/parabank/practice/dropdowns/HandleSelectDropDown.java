package com.parabank.practice.dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
      
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		driver.manage().window().maximize();
		
	WebElement dropdown = 	driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
	
	Select drop = new Select(dropdown);
	
	drop.selectByVisibleText("India");
	
	   List<WebElement> alloptions =drop.getOptions();
	   
	   System.out.println(alloptions.size());
	   
	   for(WebElement total : alloptions) {
		   
		   System.out.println(total.getText());
	   }
	
	
	}

}
