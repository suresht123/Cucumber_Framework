package com.amazon.resources;

import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	public static WebDriver driver;

	public void launch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	public void insertText(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void insertTextjs(WebElement element, String value) {
		element.sendKeys(value, Keys.ENTER);
	}

	public void windowH() {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();

		for (String x : child) {
			if (!parent.equals(child)) {
				driver.switchTo().window(x);
				System.out.println("window swiched");
			}
		}
	}

	public void jasc() throws Throwable {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement scroll = driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));
		j.executeScript("arguments[0].scrollIntoView(true);", scroll);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(3000);

	}
}
