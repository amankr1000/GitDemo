package com;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vegetables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aman\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] vegies = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		int k = 0;
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < products.size(); i++) {
			// separating 1 kg
			String[] name = products.get(i).getText().split("-");
			// space trimming
			String formattedName = name[0].trim();
			// Convert Array to Arraylist
			List items = Arrays.asList(vegies);
			if (items.contains(formattedName)) {
				for (int j = 1; j < 5; j++) {
					driver.findElements(By.xpath("//a[@class='increment']")).get(i).click();
				}
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (k == vegies.length) {
					break;
				}

			}

		}

	}

}
