package com.parabank.practice.mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Mouse Haover means - mouse pointing the particular element 
public class MouseHaover {

	public static void main(String[] args) throws InterruptedException {

		MouseHaover obj = new MouseHaover();

		obj.PointingtheMacWindows();

	}

	public void PointingtheMacWindows() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.clear();
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.clear();
		password.sendKeys("admin123");

		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		// Actions class create a object
		Actions act = new Actions(driver);

		WebElement admin = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']"));

		WebElement pim = driver.findElement(By.xpath("//a[normalize-space()='']"));

		Thread.sleep(5000);
		act.moveToElement(admin).perform();
		Thread.sleep(5000);
		act.moveToElement(pim).perform();
		Thread.sleep(5000);

		admin.click();
	}

}
