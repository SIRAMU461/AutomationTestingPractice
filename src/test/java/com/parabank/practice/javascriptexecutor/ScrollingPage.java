package com.parabank.practice.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll the page by using JavaScriptExecutor
		// Three types or scenarios of Scrolling is there
		// 1. By using pixel values
		// 2. By using target element is displayed or not
		// 3. By using bottom of the page and top of the page without any restriction or
		// condition.

		// 1. Scroll by pixel value
		js.executeScript("window.scrollBy(0, 1500);");
		Thread.sleep(5000);

		// Scroll up again
		js.executeScript("window.scrollBy(0, -1500);");
		Thread.sleep(5000);
		
		//2. // 2. By using target element is displayed then scrolling the page 
		WebElement footerpage = driver.findElement(By.xpath("//h2[normalize-space()='Footer Links']"));
		js.executeScript("arguments[0].scrollIntoView();" , footerpage);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, 0);");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, 3501);");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, -3501);");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	}

}
