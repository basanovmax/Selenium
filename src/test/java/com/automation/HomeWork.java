package com.automation;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWork {
	public static void main(String[] args) {
/*		Open website https://www.saucedemo.com/
		Login with Valid Credentials & Navigates to the homepage
		Click on add to cart button of the first item
		Click on the cart icon and navigates to the cart page
		Click on the checkout button
		Fill in all the required details on the checkout page
		Click on the Continue button and navigates to the review order page
		Print the total amount from the review order page into the output
		Click on the Finish button
		Print confirmation message in the output*/

		WebDriver driver = new ChromeDriver();
	/*	driver.manage().window().maximize();*/
		//1. Open website https://www.saucedemo.com/
		driver.get("https://www.saucedemo.com/");
		//2. Login with Valid Credentials & Navigates to the homepage
		WebElement username = driver.findElement(By.xpath("//input[@id = 'user-name' ]"));
		WebElement password = driver.findElement(By.xpath("//input[@id = 'password' ]"));

		String AccUserName = driver.findElement(By.xpath("//div[@id='login_credentials']")).getText().split(":")[1].substring(0,14);
		String AccPassword = driver.findElement(By.xpath("//div[@class='login_password']")).getText().split(":")[1].trim();

		username.sendKeys(AccUserName);
		password.sendKeys(AccPassword);
		driver.findElement(By.xpath("//input[@name = 'login-button']")).click();

		//3.Click on add to cart button of the first item
		driver.findElement(By.xpath("//button[@id = 'add-to-cart-sauce-labs-backpack']")).click();

		//4.Click on the cart icon and navigates to the cart page
		driver.findElement(By.xpath("//a[@class = 'shopping_cart_link']")).click();

		//5.Click on the checkout button
		driver.findElement(By.xpath("//button[@id='checkout']")).click();

		//6.Fill in all the required details on the checkout page
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='first-name']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
		WebElement zipcode = driver.findElement(By.xpath("//input[@id='postal-code']"));
		FirstName.sendKeys("Max");
		lastName.sendKeys("Bas");
		zipcode.sendKeys("98028");

		//7.Click on the Continue button and navigates to the review order page
		driver.findElement(By.xpath("//input[@id='continue']")).click();

		//8. Print the total amount from the review order page into the output
		String total = driver.findElement(By.xpath("//div[@class='summary_info_label summary_total_label']")).getText();
		System.out.println("Total amount is " + total);

		//9.Click on the Finish button
		driver.findElement(By.xpath("//button[@name = 'finish']")).click();

		//10.Print confirmation message in the output
		String finalMes = driver.findElement(By.xpath("//h2[@class = 'complete-header']")).getText();
		String finalMes1 =driver.findElement(By.xpath("//div[@class = 'complete-text']")).getText();

		System.out.println(finalMes);
		System.out.println(finalMes1);
	}
}
