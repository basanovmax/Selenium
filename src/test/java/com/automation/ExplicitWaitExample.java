package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");


		WebElement click =  driver.findElement(By.xpath("//div[@id='start']/button"));
		click.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement text = driver.findElement(By.xpath("//div[@id='finish']"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(text));
		System.out.println(text.getText());
	}
}
