package com;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practise {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aman\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implict wait globally for 5 seconds
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String[] vegies = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		//Thread.sleep(3000L);
		Practise b =new Practise();
		b.addItems(driver,vegies);
		driver.findElement(By.xpath("//a/img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//div/button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//*[text()='Apply']")).click();
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}
		public void addItems(WebDriver driver,String[] vegies)
		{
			int k = 0;
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
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

