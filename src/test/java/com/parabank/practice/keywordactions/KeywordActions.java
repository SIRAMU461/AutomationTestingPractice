package com.parabank.practice.keywordactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordActions {
	public static void main(String[] args) {

		KeywordActions action = new KeywordActions();

		action.keywordActions();
	}

	public void keywordActions() {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/text-box");

		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.xpath("//input[@id='userName']"));

		userName.sendKeys("Ramu sigamala");

		WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));

		Email.clear();

		Email.sendKeys("ramuperfo@gmail.com");
		
	    

	}

}
