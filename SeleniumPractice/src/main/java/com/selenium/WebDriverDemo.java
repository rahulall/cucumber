package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.setProperty("webdriver.chrome.driver", "D:\\Users\\rallampa\\Desktop\\Rahul\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.google.com");
			
			WebElement searchField = driver.findElement(By.id("lst-ib"));  
			searchField.sendKeys("pluralsight");
			searchField.submit();
			
			WebElement imageLink = driver.findElements(By.linkText("Images")).get(0);
			imageLink.click();
			
			WebElement imageElement = driver.findElements(By.cssSelector("a[Class = rg_1]")).get(0);
			
			WebElement imageLink1 = imageElement.findElements(By.tagName("img")).get(0);
			
			imageLink1.click();
			
			
		}catch(Exception e){
			e.getCause();
		}

	}

}
