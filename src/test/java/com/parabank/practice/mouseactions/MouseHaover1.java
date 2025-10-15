package com.parabank.practice.mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHaover1 {
	public static void main(String[] args) {

		MouseHaover1 obj = new MouseHaover1();
		obj.Mousemoving();

	}

	public void Mousemoving() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
        
		WebElement loginbutn=   driver.findElement(By.xpath("//span[normalize-space()='Login']"));
		
		WebElement orders = driver.findElement(By.xpath("//li[normalize-space()='Orders']"));
		
		WebElement GiftCards = driver.findElement(By.xpath("//li[normalize-space()='Gift Cards']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(loginbutn).moveToElement(orders).moveToElement(GiftCards).perform();
	}
}
