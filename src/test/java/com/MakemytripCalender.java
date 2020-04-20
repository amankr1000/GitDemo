package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class MakemytripCalender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aman\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://makemytrip.com");
		Thread.sleep(2000L);
		driver.manage().window().maximize();
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		while (!driver.findElement(By.cssSelector("[class='DayPicker-Months']")).getText().contains("September")) {
			driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[2]")).click();
		}
		Thread.sleep(5000L);
		List<WebElement> date = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
		for (int i = 0; i < driver.findElements(By.xpath("//div[@class='DayPicker-Day']")).size(); i++) {

			String text = driver.findElements(By.xpath("//div[@class='DayPicker-Day']")).get(i).getText();
			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.xpath("//div[@class='DayPicker-Day']")).get(i).click();
				break;
			}

		}

	}
}
