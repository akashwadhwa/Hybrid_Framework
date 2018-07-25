package com.totsy.draft;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Let_page_Load {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/10057286/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://flipcart.com");

		// time for the page to load
		// submit form

	        Object result = ((JavascriptExecutor) driver).executeScript(
	        		"function pageloadingtime()"+
	        				"{"+
	        				"return 'Page has completely loaded'"+
	        				"}"+
	        		"return (window.onload=pageloadingtime());");
        
        System.out.println(result);
		
	}

}
