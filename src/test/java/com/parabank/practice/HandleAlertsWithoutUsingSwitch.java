package com.parabank.practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertsWithoutUsingSwitch {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		WebDriverWait normalalert = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

		Alert alert = normalalert.until(ExpectedConditions.alertIsPresent());

		alert.accept();

	}

}
