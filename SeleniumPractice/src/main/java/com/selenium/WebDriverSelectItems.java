package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSelectItems {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\rallampa\\Desktop\\Rahul\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/SatishTrainingData/TrainingsTopicsWise/BDDUsingCucumber/SeleniumPractice/src/main/resources/SelectItemTest.html");
		
		WebElement selectElement = driver.findElement(By.id("select1"));
		Select select = new Select(selectElement);
		select.selectByVisibleText("Maybe");

	}

}
