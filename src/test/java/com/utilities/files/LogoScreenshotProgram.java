package com.utilities.files;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class LogoScreenshotProgram {
	    public static void main(String[] args) throws InterruptedException, IOException {
	    	
	    	System.setProperty("webdriver.chrome.driver", "/Users/prashanthkumar/Education/corejava selenium/SimplePracticePOM/Chromedriver/chromedriver");
	    	WebDriver driver =  new ChromeDriver();
	        
	    	driver.get("https://secure.simplepractice.com/users/sign_in");
	    	driver.findElement(By.cssSelector("#user_username")).sendKeys("samyukta911");
	    	driver.findElement(By.cssSelector("#user_password")).sendKeys("Abcd1234!");
	    	driver.findElement(By.cssSelector("input[type='submit']")).click();
	        
	    	Thread.sleep(5000);
	        WebElement sPLogo = driver.findElement(By.cssSelector("#ember11 > img"));
	        Screenshot spImg = new AShot().takeScreenshot(driver,sPLogo );
	        
	        
	       ImageIO.write(spImg.getImage(), "PNG", new File("/Users/prashanthkumar/Education/corejava selenium/SimplePracticePOM/ResourceFolder/ExpectedLogo.png"));
	       Thread.sleep(5000);
	        driver.quit();
	    }
	}
	



