package com.parabank.practice.datapickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDataPickers {

	public static void main(String[] args) {

		HandleDataPickers obj = new HandleDataPickers();
		obj.Datapickers();

	}

	public void Datapickers() {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/datepicker/");
//
//		// method 1 : using Send keys
		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("06/03/1999");

		// method 2: ittaration or Date Pickers
		// select year and month
		// then after select date .

		String year = "1999";
		String month = "June";
		String Day = "3";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		while (true) {
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

			if (currentyear.equals(year) && currentmonth.equals(month)) {

				break;
			}

			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //Next
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //Last
			
		}
		
		//Select date 
		
		    List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		    
		    for(WebElement dt : dates) {
		    	
		    	if(dt.getText().equals(Day)) {
		    		dt.click();
		    	}
		    }

	}

}
