package facebookgit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Launching Facebook..........");
			System.setProperty("webdriver.gecko.driver","C:\\Users\\91964\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
		    System.out.println("Enter credentials...........");
		    driver.findElement(By.id("email")).sendKeys("Sruthyajay");
		    driver.findElement(By.id("pass")).sendKeys("Sruthyajay29@@");
		    driver.findElement(By.name("login")).click();
		}
	}

