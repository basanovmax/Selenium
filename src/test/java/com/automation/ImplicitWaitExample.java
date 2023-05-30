package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitExample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

		WebElement click =  driver.findElement(By.xpath("//div[@id='start']/button"));
		click.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement text = driver.findElement(By.xpath("//div[@id='finish']"));
		System.out.println(text.getText());
	}
}
