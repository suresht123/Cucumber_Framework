package com.amzn.stepdefenition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.amazon.resources.CommonActions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hoooks extends CommonActions{
	CommonActions c = new CommonActions();
@Before
	
	public void beforeScenario() {
		
	c.launch("https://www.amazon.in/");
         
	}
		
		
   @After
   public void afterScenrio(Scenario Scenario) {
	   
	   if (Scenario.isFailed()){
		   
		   final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		   Scenario.embed(screenshot, "image.png");
	   
		   
	   }else{
		   
		   final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		   Scenario.embed(screenshot, "image.png");
		   
	   }
	   
	   driver.quit();


   }

}
