package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasicAutomation.BrowserFactory;

public class LoginPage extends BrowserFactory {
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(xpath="//input[type=submit]")
	private WebElement button;
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateloginpagetittle() {
		return driver.getTitle();
	}
	
	public void logo() {
		button.isDisplayed();
	}
}
