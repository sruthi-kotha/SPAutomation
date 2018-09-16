package com.sp.SPMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAppointmentPage extends SimplePracticeHomepage {
	WebDriver driver=null;
	@FindBy(css = ".ember-power-select-placeholder")
	WebElement searchBarClient;
	@FindBy(css = ".secondary")
	WebElement newClient;
	@FindBy(css = ".primary")
	WebElement done;
	@FindBy(css = "[name='office']")
	WebElement locationDD;
	
	@FindBy(css = "[name='attendanceType']")
	WebElement appointmentTypeDD;
	@FindBy(css = "[name='recurringPeriod']")
	WebElement repeatsDD;
	
	
	public NewAppointmentPage(WebDriver driver) {
		super(driver);
		
	}
	


}
