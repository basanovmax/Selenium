package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoClass3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.ebay.com");
		// Search with Laptop and click on search button
		WebElement Search = driver.findElement(By.xpath("//input[@id='gh-ac']"));
		WebElement SearchButton = driver.findElement(By.xpath("//input[@id='gh-btn']"));
		Search.sendKeys("Laptop");
		SearchButton.click();

		List <WebElement> listOfPrice = driver.findElements(By.xpath("//span[@class='s-item__price']"));
		for  ( WebElement price: listOfPrice) {
			System.out.println(price.getText());
		}
	}
}
