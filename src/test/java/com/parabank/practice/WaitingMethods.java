package com.parabank.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Implicity Waiting
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Explicit Wait

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // declaration

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement username = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));

		username.sendKeys("Ramu0777");

		WebElement password = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name ='password']")));

		password.sendKeys("R@muvenky07");

		WebElement buttton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));

		buttton.click();
		
		//fluent Waitting 
		
		

	}

}
