package org.resources;

import org.openqa.selenium.WebElement;

public class BaseClass {

	public static void fill(WebElement w,String s) {
		w.sendKeys(s);
		
	}
	
	public static void klik(WebElement w) {
		w.click();
	}
	
	
	
	
}
