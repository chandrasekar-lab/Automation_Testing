package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//1.Open Chrome
		//2.Google home paage
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sekar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}

}
