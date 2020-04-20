package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SumTableGrid {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aman\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/20193/rsaixi-vs-pak-3-day-practice-match-pakistan-tour-of-south-africa-2018-19");
		driver.manage().window().maximize();
		int sum = 0;
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();
		for (int i = 0; i < count - 2; i++) {

			String batsman = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			int batsmanscore = Integer.parseInt(batsman);
			sum = sum + batsmanscore;

		}
		System.out.println(sum);

		String extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasscore = Integer.parseInt(extras);
		int totalsum = sum + extrasscore;
		System.out.println(totalsum);

		String total = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int totalscore = Integer.parseInt(total);
		if (totalscore == totalsum) {
			System.out.println("Count Match");

		} else {
			System.out.println("Count didnt match");
		}
	}

}
