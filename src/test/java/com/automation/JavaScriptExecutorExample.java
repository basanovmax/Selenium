package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.awt.SystemColor.window;

public class JavaScriptExecutorExample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://the-internet.herokuapp.com/infinite_scroll");


		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='gh-btn']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border = 'thick solid red';", dropdown);
		js.executeScript("arguments[0].style.border = 'thick solid red';", searchBox);
		js.executeScript("arguments[0].style.border = 'thick solid red';", searchButton);

		for (int i = 0; i < 10; i++) {
			js.executeScript("window.scrollTo(0, 1500)");
			try {
				// Add a short delay between scrolls to allow the page to load
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

