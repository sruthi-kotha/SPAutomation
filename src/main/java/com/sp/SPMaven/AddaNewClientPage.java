package com.sp.SPMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddaNewClientPage extends SimplePracticeHomepage {
	WebDriver driver=null;
	@FindBy(css = ".js-create-client-link")
	WebElement createClient;
	@FindBy(css = "#client_info div:nth-child(2) .control-label .optional")
	WebElement activeButton;
	@FindBy(css = ".client_first_name .form-control")
	WebElement firstName;
	@FindBy(css = ".client_middle_name .form-control")
	WebElement middleName;
	@FindBy(css = ".client_last_name .form-control")
	WebElement lastName;
	@FindBy(css = ".client_suffix .form-control")
	WebElement suffix;
	@FindBy(css = "[label]")
	WebElement preferredName;
	@FindBy(css = ".js-add-phone")
	WebElement addPhoneNumberButton;
	@FindBy(css = ".client_phones_number .form-control")
	WebElement phoneField;
	@FindBy(css = ".input.select.required.client_phones_type.phone_type_selection.good .select.required.input-sm.input-s-sm")
	WebElement mobileDD;
	@FindBy(css = ".client_phones_leave_voice_message .control-label .optional")
	WebElement voiceMessageButton;
	@FindBy(css = ".client_phones_leave_text_message .control-label .optional")
	WebElement textMessageButton;
	@FindBy(css = "#client_info div:nth-child(11) .add_nested_fields")
	WebElement addEmailButton;
	@FindBy(css = ".client_emails_address .form-control")
	WebElement emailField;
	@FindBy(css = ".input.select.required.client_emails_type .select.required.input-sm.input-s-sm")
	WebElement workDD;
	@FindBy(css = ".client_emails_email_consent_given .control-label .optional")
	WebElement emailOkButton;
	@FindBy(css = ".collection_radio_buttons_inline span:nth-child(2) [data-billing-type]")
	WebElement selfpayButton;
	@FindBy(css = ".collection_radio_buttons_inline span:nth-child(3) [data-billing-type]")
	WebElement insuranceButton;
	@FindBy(css = ".other-fields .address:nth-child(3) .add_nested_fields")
	WebElement addAddressButton;
	@FindBy(css = ".form-control.street")
	WebElement streetField;
	@FindBy(css = "[size='20']")
	WebElement cityField;
	@FindBy(css = ".input.grouped_select.optional.client_addresses_state.state .grouped_select.optional.state")
	WebElement provinceDD;
	@FindBy(css = "[size='14']")
	WebElement zipField;
	@FindBy(css = "select[id='client_birth_date_2i']")
	WebElement birthMonthDD;
	@FindBy(css = "select[id='client_birth_date_3i']")
	WebElement birthdayDD;
	@FindBy(css = "select[id='client_birth_date_1i']")
	WebElement birthYearDD;
	@FindBy(css = ".other-fields [data-feature-related-clients-enabled]")
	WebElement clientMinorButton;
	@FindBy(css = ".input.select.optional.client_gender .select.optional.input-sm.input-s-sm")
	WebElement genderDD;
	@FindBy(css = ".input.select.optional.client_relationship_status .select.optional.input-sm.input-s-sm")
	WebElement relationStatusDD;
	@FindBy(css = ".input.select.optional.client_employment_status .select.optional.input-sm.input-s-sm")
	WebElement employmentStatusDD;
	@FindBy(css = ".input.select.optional.client_race .select.optional.input-sm.input-s-sm")
	WebElement raceDD;
	@FindBy(css = ".input.select.optional.client_ethnicity .select.optional.input-sm.input-s-sm")
	WebElement ethinicityDD;
	@FindBy(css = ".input.select.optional.client_preferred_language .select.optional.input-sm.input-s-sm")
	WebElement preferredLangDD;
	@FindBy(css = "[for='client_practice_consent_document_ids_1485187'] .check_boxes")
	WebElement signedDocForTeleButton;
	@FindBy(css = "[for='client_practice_consent_document_ids_1485194'] .check_boxes")
	WebElement infConsentForCrTreatmentButton;
	@FindBy(css = "[for='client_practice_consent_document_ids_1485201'] .check_boxes")
	WebElement noticeOfPrivacyButton;
	@FindBy(css = "[for='client_practice_consent_document_ids_1485208'] .check_boxes")
	WebElement practicePolicyButton;
	@FindBy(css = "[rows]")
	WebElement notesTextArea;
	@FindBy(css = "select[id='client_date_first_visit_2i']")
	WebElement dateFirstSeenMonth;
	@FindBy(css = "select[id='client_date_first_visit_3i']")
	WebElement dateFirstSeenDay;
	@FindBy(css = "select[id='client_date_first_visit_1i']")
	WebElement dateFirstSeenYear;
	@FindBy(css = ".client_referred_by .form-control")
	WebElement referredByField;
	@FindBy(css = ".secondary-dismissive")
	WebElement newClientCancelButton;
	@FindBy(css = "[type='submit']")
	WebElement saveClientButton;
	
	public AddaNewClientPage(WebDriver driver) {
		super(driver);
		
	}
	public void selectCreateClient() {
		createClient.click();
	}
	public void fillNameSection(){
		firstName.sendKeys("sam");
		middleName.sendKeys("kumar");
		lastName.sendKeys("yukta");	
		suffix.sendKeys("Mr");
		preferredName.sendKeys("sam"); 
	}
	/*public void fillPhoneSection(){
		addPhoneNumberButton.click();
		phoneField.sendKeys("5142363457");
		mobileDD.click();
		voiceMessageButton.click();
		textMessageButton.click();
	
	}*/
	public void saveClientBtnClick() {
		
		saveClientButton.click();
	}
	

}
