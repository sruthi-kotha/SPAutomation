package com.sp.SPMaven;

import org.testng.Assert;
import org.testng.annotations.AfterTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utilities.files.ResourceFileReader;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SimplePracticeHomePageTest {

	WebDriver driver = null;

	SimplePracticeHomepage spHomePage = null;

	ResourceFileReader rsFileReader = new ResourceFileReader();

	@BeforeTest
	public void setUp() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get(rsFileReader.selectBaseUrl());

		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("#user_username")).sendKeys(rsFileReader.selectUsername());

		driver.findElement(By.cssSelector("#user_password")).sendKeys(rsFileReader.selectPassword());

		driver.findElement(By.cssSelector("input[type=submit]")).click();

		spHomePage = PageFactory.initElements(driver, SimplePracticeHomepage.class);

	}

	@AfterTest
	public void browserClose() throws InterruptedException {
		
		driver.close();
	}

	@Test(priority = 1)
	public void verifyLogoPresence() {
		boolean present = spHomePage.isLogoPresent();
		Assert.assertTrue(present);
	}


	@Test(priority = 3)
	public void upgradeMyAccountShouldBeVisible() {
		boolean upMyAccountEle = spHomePage.isUpgradeMyAccountVisible();
		Assert.assertTrue(upMyAccountEle);
	}

	@Test(priority = 4)
	public void createBtnShouldBeVisible() {
		boolean createBtnEle = spHomePage.isCreateButtonVisible();
		Assert.assertTrue(createBtnEle);

	}

	@Test(priority = 5)
	public void searchBarShouldBeVisible() {
		boolean searchBarEle = spHomePage.isSearchBarVisible();
		Assert.assertTrue(searchBarEle);

	}

	@Test(priority = 6)
	public void helpButtonShouldBeVisible() {
		boolean helpButtonEle = spHomePage.isHelpButtonVisible();
		Assert.assertTrue(helpButtonEle);

	}

}
	


