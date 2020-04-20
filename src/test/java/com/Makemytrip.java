package com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Makemytrip {

	public static void main (String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aman\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("sessionKey");
		//driver.findElement(By.id("fromCity")).clear();
		driver.findElement(By.id("fromCity")).sendKeys("BOM");
		Thread.sleep(2000L);
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000L);
		System.out.println("Mumbai Select as source");
		driver.close();
		//driver.findElement(By.id("fromCity")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.id("fromCity")).sendKeys(Keys.ENTER);
	}
}
