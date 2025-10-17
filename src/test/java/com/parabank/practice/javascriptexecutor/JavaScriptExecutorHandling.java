package com.parabank.practice.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();

		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));

		name.clear();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Alternative of SendKeys method ---
		js.executeScript("arguments[0].setAttribute('value', 'Ramu sigamala')", name);
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='male']"));
	
		
		//alternative of Click method ----
		js.executeScript("arguments[0].click()" , checkBox);
		
		
	}
}
