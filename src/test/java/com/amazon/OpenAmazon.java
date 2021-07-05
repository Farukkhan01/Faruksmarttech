package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	      System.setProperty("webdriver.chrome.driver",
	      "C:\\drive\\chromedriver.exe");

       WebDriver driver = new ChromeDriver();
	      // browser type and chromedrover.exe path as parameters
	      
	      
	      String url = " https://www.amazon.com/";
	      driver.get(url);

	}

}
