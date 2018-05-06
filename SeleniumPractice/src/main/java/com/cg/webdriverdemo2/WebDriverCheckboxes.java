package com.cg.webdriverdemo2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\rallampa\\Desktop\\Rahul\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("D:\\SatishTrainingData\\TrainingsTopicsWise\\BDDUsingCucumber\\SeleniumPractice\\src\\main\\resources\\CheckboxTest.html");

		By element = By.id("lettuceCheckbox");
		

		WebElement checkbox = driver.findElement(element);
		
		Thread.sleep(2000);
		
		checkbox.click();
		
		if(checkbox.isSelected()) {
			System.out.println("Value of checkBox :- "+checkbox.getAttribute("value") );
		}
	}	

}
