package com.parabank.practice.uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFlie {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys("C:\\Users\\USER\\Documents\\loan.txt");

		String uploadfilename = driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText();

		System.out.println(uploadfilename);
		
		if(uploadfilename.equals("loan.txt")) {
			System.out.println("Test case passed");
		}
		
		
		driver.close();
		
		WebDriver diver1 = new ChromeDriver();
		
		diver1.get("https://www.google.com");
		
		diver1.switchTo().newWindow(WindowType.TAB);
		
		diver1.get("https://www.google.com");

	}

}
