package com.totsy.draft;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Affiliated {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/10057286/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.navigate().to("https://staging.totsy.com/a/yellowhammer");
		driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
		
					
		for (int i=1;i<=500;i++) {					
	
		driver.findElement(By.xpath("//*[@id='email_address']")).sendKeys("ssayem+6001"+i+"@totsy.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("sami3092");
		driver.findElement(By.xpath("//*[@id='confirmation']")).sendKeys("sami3092");
		driver.findElement(By.xpath("//*[@id='submit-button']")).click();
		
		try {
			WebElement text = driver.findElement(By.xpath("html/body/div[2]/div/iframe[1]"));		
			
			if (text.isDisplayed()) {
				System.out.println("Yay! Element is present");
			}else{
				System.out.println("Oops!! Element is not present");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Delete all the cookies
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		
				
		
		}
	}
}
		
