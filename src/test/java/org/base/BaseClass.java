package org.base;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;
	WebDriverWait wait;

	public static WebDriver getDriver(String browser) {
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Invalid browser");
			break;
		}
		driver.manage().window().maximize();
		return driver;
	}

	public WebElement waitForElement(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public WebElement elementToClick(WebElement element) {
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void enterUrl(String url) {
		driver.get(url);
	}

	public void enterTextValue(WebElement element, String data) {
		waitForElement(element).sendKeys(data);
	}

	public void btnClick(WebElement element) {
		element.click();
	}

	public byte[] getScreenshot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		return screenshotAs;
	}

	public void tearDown() {
		driver.quit();
	}
}
