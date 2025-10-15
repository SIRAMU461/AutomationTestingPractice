package com.parabank.practice.tables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleStaticTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

//		 String name = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[2]/td[2]")).getText();
//		 
//		 System.out.println(name);

		// Total no of rows
		int rows = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		System.out.println("Total no of rows :" + rows);

		// Total no of Columns
		int cols = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
		System.out.println("Total no of Columns :" + cols );
		
		
		//Print Exact Table 
				for(int r =2; r<=rows ; r++) {
			for(int c =1 ; c<=cols; c++) {
			  String values = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
			  System.out.println();
			  System.out.println(values);
			  System.out.println("");
			}
		}		
		
     driver.close();
	}


}
