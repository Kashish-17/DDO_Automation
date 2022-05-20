package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class UploadImageObjects {
	public WebDriver driver;

	public UploadImageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By UploadImage = By.cssSelector("#filefield-1283-button-fileInputEl");
	By msgBox = By.xpath("//div[text()='Successfully uploaded']");
	By OkButton = By.xpath("//span[text()='OK']");

	public WebElement getUploadImage() {
		return driver.findElement(UploadImage);
	}

	public WebElement getmessagebbox() {
		return driver.findElement(msgBox);
	}

	public WebElement getOkButton() {
		return driver.findElement(OkButton);
	}
}
