package com.parabank.practice.slider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleSlider {
	
	public static void main(String[] args) {
		
		HandleSlider obj = new HandleSlider();
		
		obj.slidermove();
		
	}
	
	public void slidermove() {
		
         WebDriver driver = new ChromeDriver();
         
         Actions act = new Actions(driver);	
         
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         
         driver.get("https://jqueryui.com/slider/");
         
         driver.manage().window().maximize();
         
         
         driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
         
         WebElement min_point = driver.findElement(By.xpath(".//div[@id='slider']/span"));
         
         System.out.println("Slider initial position: "+ min_point.getLocation());
         
         act.dragAndDropBy(min_point, 58, 4).perform();
	}

}
