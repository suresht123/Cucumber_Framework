package com.amazon.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.resources.CommonActions;

public class mobipage extends CommonActions {
public mobipage () {
		
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath ="//input[@type='text']")
private WebElement sendkeys;

@FindBy(xpath ="//input[@value='Go']")
private WebElement searchclick;
	
@FindBy(xpath ="(//span[contains(@class,'a-size-medium a-color-base a-text-normal')])[2]")
private WebElement mobileclick;

public WebElement getSendkeys() {
	return sendkeys;
}

public WebElement getSearchclick() {
	return searchclick;
}

public WebElement getMobileclick() {
	return mobileclick;
}


}


