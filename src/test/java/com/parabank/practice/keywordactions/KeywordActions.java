package com.parabank.practice.keywordactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeywordActions {
	public static void main(String[] args) throws InterruptedException {

		KeywordActions action = new KeywordActions();

		action.keywordActions();
	}

	public void keywordActions() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/text-box");

		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.xpath("//input[@id='userName']"));

		userName.sendKeys("Ramu sigamala");

		WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));

		Email.clear();

		Email.sendKeys("ramuperfo@gmail.com");

		Thread.sleep(5000);

		Actions act = new Actions(driver);

		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		Thread.sleep(5000);
		act.keyDown(Keys.CONTROL).sendKeys("X").keyUp(Keys.CONTROL).perform();

	}

}
