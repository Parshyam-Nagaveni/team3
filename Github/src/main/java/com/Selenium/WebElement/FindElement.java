package com.Selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElement {
	
	@Test(priority = 0)
	public void findElementTest() {
		
		//Whenever we have same locator for 2 elements, findElement will find the very first element and fill that particular place
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\918628\\eclipse-workspace\\WebElementDemo\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//go to facebook and find 2 elements with same class name and see how findElement works on it
		
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("venisatya@gmail.com");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("email")).sendKeys("werty");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//If we give some classname that is not present in source code, findElement will throw error that NoSuchElementFoundException
		
		driver.quit();
		
	}

}
