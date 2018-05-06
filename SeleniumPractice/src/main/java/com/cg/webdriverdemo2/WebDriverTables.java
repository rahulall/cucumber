package com.cg.webdriverdemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\rallampa\\Desktop\\Rahul\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/SatishTrainingData/TrainingsTopicsWise/BDDUsingCucumber/SeleniumPractice/src/main/resources/TableTest.html");
		
		//WebElement outerTable = driver.findElement(By.tagName("table"));
		//WebElement innerTable = outerTable.findElement(By.tagName("table"));
		//WebElement row = innerTable.findElements(By.tagName("td")).get(1);
		//System.out.println(row.getText());
		
		//xpath is to get the element where message or anything dynamically get generated
		WebElement row = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
		System.out.println(row.getText());

	}

}
