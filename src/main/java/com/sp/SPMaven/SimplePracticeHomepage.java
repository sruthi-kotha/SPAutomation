package com.sp.SPMaven;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class SimplePracticeHomepage {

	WebDriver driver = null;

	@FindBy(css = "a[id= 'ember11']")
	WebElement simplePracticeLogo;

	@FindBy(css = "input[name= 'search']")
	WebElement searchBar;

	@FindBy(css = "a[class= 'button create']")
	WebElement createButton;

	@FindBy(css = "#ember10 > div > div.left > div.dropdown > ul")
	WebElement createButtonDropDown;

	@FindBy(css = "ul[class='dropdown-menu my-account-dropdown']")
	WebElement myAccountDropDown;

	@FindBy(css = "a[class='button primary-special js-upgrade-account-link']")
	WebElement upgradeMyAccount;

	@FindBy(css = "a[class='my-account js-my-account ']")
	WebElement myAccount;

	@FindBy(css = "body > div.container > div > div > div.left-nav > div.menu > a:nth-child(3)")
	WebElement calendar;
	@FindBy(css = "#ember14")
	WebElement calendarText;

	@FindBy(css = "i[class= 'fa fa-user']")
	WebElement clients;

	@FindBy(css = "i[class= 'fa fa-usd']")
	WebElement billing;

	@FindBy(css = "i[class='fa fa-graph']")
	WebElement insights;

	@FindBy(css = "i[class= 'fa fa-activity']")
	WebElement activity;

	@FindBy(css = "i[class= 'fa fa-checkmark']")
	WebElement reminders;

	@FindBy(css = "button[id='solvvy-support-flow-launch-widget']")
	WebElement helpButton;

	@FindBy(css = "#solvvy-auto-support-flow")
	WebElement helpPopupWindow;

	@FindBy(css = "i[class= 'fa fa-calendar-plus']")
	WebElement createAppointment;
	
	@FindBy(css = "div[class='tether-content']")
	WebElement createAppointmentPopup;
	
	@FindBy(css = "a[class='button secondary-dismissive cancel pull-right']")
	WebElement createAppointmentCancelBtn;
	
	@FindBy(css = "form[action='/users/sign_out']")
	WebElement signoutButton;
	
	@FindBy(css = "div[class='banner has-icon banner-success has-dismiss']")
	WebElement aftersignoutDialogMessage;
	
	@FindBy(css = "section[class='top no-border']")
	WebElement clientsPageHeading;
	
	@FindBy(css = "h2[class='mb0']")
	WebElement billingPageHeading;
	
	@FindBy(css = "div[class='header']>h2")
	WebElement insightsPageHeading;
	
	@FindBy(css = "section[class='top']>h1")
	WebElement activityPageHeading;
	
	@FindBy(css = "div[class='header']>h2")
	WebElement remindersPageHeading;
	
	@FindBy(css = "div[class='fc-left']")
	WebElement calendarPageHeading;
	
	@FindBy(css = "#ember11 > img")
	WebElement currentSPImg;
	
	
	public SimplePracticeHomepage(WebDriver driver) {

		this.driver = driver;

	}

	public boolean isLogoPresent() {
		System.out.println(simplePracticeLogo.isDisplayed());
		return simplePracticeLogo.isDisplayed();
	}

	public void CreatebtnClick() {
		createButton.click();
	}

	public boolean isCreateBtnDDVisible() {
		return createButtonDropDown.isDisplayed();
	}

	public void MyAccountBtnClick() {
		myAccount.click();
	}

	public boolean isMyAccountDDVisible() {
		return myAccountDropDown.isDisplayed();
	}

	public String CalendarText() {

		return calendarText.getText();
	}

	public boolean isUpgradeMyAccountVisible() {

		return upgradeMyAccount.isDisplayed();
	}

	public boolean isCreateButtonVisible() {
		return createButton.isDisplayed();
	}

	public boolean isSearchBarVisible() {

		return searchBar.isDisplayed();
	}

	public boolean isHelpButtonVisible() {

		return helpButton.isDisplayed();
	}

	public boolean isHelpPopupVisible() {

		return helpPopupWindow.isDisplayed();
	}

	public void helpButtonClick() {
		helpButton.click();
	}

	/*public String getTextInSearchBar() {
		return searchBar.getText();
	}

	public void sendTextIntoSearchBar() {
		searchBar.sendKeys("abcd");
		String value = searchBar.getText();
		System.out.println(value);
	}*/
	public void selectCreateAppointmentFromDD(){
		
		createAppointment.click();
	}

	public boolean isCreateAppointmentPopupVisible() {
		
		return createAppointmentPopup.isDisplayed();
	}

	public void selectLogoutFromMyAccountDD() {
		
		signoutButton.click();
	}

	public boolean isAfterLogoutMsgDialogBoxVisible() {
		
		return aftersignoutDialogMessage.isDisplayed();
	}
	public void selectClientsOption(){
		clients.click();
	}
	public String  clientsPageVisibility(){
		return clientsPageHeading.getText();
		 
	}
	public void selectBillingOption(){
		billing.click();
	}
	public String  billingPageVisibility(){
		return billingPageHeading.getText();
		 
	}
	public void selectInsightsOption(){
		insights.click();
	}
	public String  insightsPageVisibility(){
		return insightsPageHeading.getText();
		 
	}
	public void selectActivityOption(){
		activity.click();
	}
	public String  activityPageVisibility(){
		return activityPageHeading.getText();
		 
	}
	public void selectRemindersOption(){
		reminders.click();
	}
	public String  remindersPageVisibility(){
		return remindersPageHeading.getText();
		 
	}
	public void selectCalendarOption(){
		calendar.click();
	}
	public String  calendarPageVisibility(){
		return driver.getTitle();
		 
	}
public BufferedImage getSPIcon() throws IOException {
        
        Screenshot currentSPImg1 = new AShot().takeScreenshot(driver,currentSPImg );
        ImageIO.write(currentSPImg1.getImage(), "PNG", new File("/Users/prashanthkumar/Education/corejava selenium/SimplePracticePOM/ResourceFolder/ActualLogo.png"));
        return currentSPImg1.getImage();
    }

}
