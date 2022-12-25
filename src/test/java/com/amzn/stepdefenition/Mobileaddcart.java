package com.amzn.stepdefenition;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.amazon.object.mobipage;
import com.amazon.resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Mobileaddcart extends CommonActions {
	CommonActions c = new CommonActions();
	mobipage m = new mobipage();

	@Given("user enter Amazon url")
	public void user_enter_Amazon_url() {
	}
	String names;
	@When("user search the mobile")
	public void user_search_the_mobile() throws InterruptedException {
		names = "vivo";
		c.insertTextjs(m.getSendkeys(), names);
		m.getSearchclick();
	}
	@When("user select the mobile")
	public void user_select_the_mobile() {
		WebElement mobilename = m.getMobileclick();
		mobilename.click();
	}
	@Then("user add to cart mobile")
	public void user_add_to_cart_mobile() throws Throwable {
		c.windowH();
		c.jasc();
	}
	@When("user search the mobile by using oneD list")
	public void user_search_the_mobile_by_using_oneD_list(io.cucumber.datatable.DataTable dataTable) throws Throwable {
		List<String> data = dataTable.asList();
		names = data.get(1);
		c.insertTextjs(m.getSendkeys(), names);
		m.getSearchclick();
	}
	@When("user search the mobile by using oneD map")
	public void user_search_the_mobile_by_using_oneD_map(io.cucumber.datatable.DataTable dataTable) throws Throwable {
		Map<String, String> data1 = dataTable.asMap(String.class, String.class);
		names = data1.get("mobile1");
		c.insertTextjs(m.getSendkeys(), names);
		m.getSearchclick();
	}
	@When("user search the mobile {string}")
	public void user_search_the_mobile(String string) throws Throwable {
		names = string;
		c.insertTextjs(m.getSendkeys(), names);
		m.getSearchclick();
	}
}