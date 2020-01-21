package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Hooks.driver, this);
	}

	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(id="loginbutton")
	private WebElement btn;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtn() {
		return btn;
	}
}
