package com.parabank.practice.tables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicPaginationTable {

	public static void main(String[] args) {

		HandleDynamicPaginationTable run = new HandleDynamicPaginationTable();

		run.HandleDyanmicTable();

	}

	public void HandleDyanmicTable() {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@class='ico-register']")).click();

		WebElement malebutton = driver.findElement(By.xpath("//input[@id='gender-male']"));

		if (!malebutton.isSelected()) {
			malebutton.click();
		}

		WebElement fristname = driver.findElement(By.xpath("//input[@id='FirstName']"));
		fristname.clear();
		fristname.sendKeys("Ramu");

		WebElement lastname = driver.findElement(By.xpath("//input[@id='LastName']"));
		lastname.clear();
		lastname.sendKeys("Sigamala");

		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		email.clear();
		email.sendKeys("ramuperfo@gmail.com");

		WebElement companyName = driver.findElement(By.xpath("//input[@id='Company']"));
		companyName.clear();
		companyName.sendKeys("Capgemini");

		WebElement newsletter = driver.findElement(By.xpath("//input[@id='Newsletter']"));
		if (newsletter.isSelected()) {
			newsletter.click();
		}

		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("R@muvenky07");

		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("R@muvenky07");

		driver.findElement(By.xpath("//button[@id='register-button']")).click();

	}
}
