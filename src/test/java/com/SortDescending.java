package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortDescending {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aman\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		//driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		List<WebElement> firstlist = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		ArrayList<String> originallist = new ArrayList<String>();
		for (int i = 0; i < firstlist.size(); i++) {
			System.out.println(firstlist.get(i).getText());
			originallist.add(firstlist.get(i).getText());
		}
		ArrayList<String> copiedlist = new ArrayList<String>();
		for (int i = 0; i < originallist.size(); i++) {
			System.out.println(originallist.get(i));
			copiedlist.add(originallist.get(i));
		}
		Collections.sort(copiedlist);
		Collections.reverse(copiedlist);
		for (int i = 0; i < copiedlist.size(); i++) {
			System.out.println(copiedlist.get(i));
		}

		Assert.assertTrue(originallist.equals(copiedlist));
	}

}
