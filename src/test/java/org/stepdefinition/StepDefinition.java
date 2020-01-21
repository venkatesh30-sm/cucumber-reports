package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.repository.LoginPage;
import org.resources.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	LoginPage l;
	@Given("user launches facebook")
	public void user_launches_facebook() {
	   Hooks.driver.get("https://www.facebook.com/");
	   
	}

	@When("user enter login details")
	public void user_enter_login_details() {
		l=new LoginPage();
		fill(l.getUser(),"greens@123");
		fill(l.getPassword(),"6360036");
		
	}

	@Then("user hits login btn")
	public void user_hits_login_btn() {
	  klik(l.getBtn());
	}
	@Given("user launches flipkart")
	public void user_launches_flipkart() {
	  Hooks.driver.get("https://www.flipkart.com/");
	}

	@When("user searches for iphone")
	public void user_searches_for_iphone() {
		klik( Hooks.driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")));
		fill(Hooks.driver.findElement(By.xpath("//input[@type='text']")),"iphone");
		Assert.assertTrue(false);
		
	  
	}

	@Then("user hits search button")
	public void user_hits_search_button() {
	    klik(Hooks.driver.findElement(By.xpath("//button[@type='submit']")));
	}

}
