package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
	public static void main(String[] args) {

/*		=========Homework 29 May ===========
		Task 1 : Write a XPath from the attached HTML document
		Find all child of the bookstore that is not a book
		Find all the book that doesn't have a publication year
		Find the cost of the book that has the title "Learning XML"
		Find the publication of the book that has a price of "45.95"*/

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("C:\\Users\\maxba\\IdeaProjects\\SeleniumProject\\target\\Demo.html");

		//Find all child of the bookstore that is not a book
		driver.findElement(By.xpath("//bookstore/*[not(self::book)]"));

		//Find all the book that doesn't have a publication year
		driver.findElement(By.xpath("//bookstore/book[not(year)]"));

		//Find the cost of the book that has the title "Learning XML"
		driver.findElement(By.xpath("//bookstore/book/title[text()='Learning XML']/following-sibling::price"));

		//Find the publication of the book that has a price of "45.95"
		driver.findElement(By.xpath("//book/price[text()='45.95']/following-sibling::publication"));





	}
}
