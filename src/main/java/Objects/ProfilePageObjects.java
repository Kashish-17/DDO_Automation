package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProfilePageObjects {
	public WebDriver driver;

	public ProfilePageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By profileButton = By.xpath("//span[@id='button-1061-btnInnerEl']");
	By elements = By.id("menu-1062-innerCt");
	By profile = By.id("menuitem-1063-textEl");
	By imageContainer = By.cssSelector("div[id^='container'][class*='userProfilePic']");
	By projectSummaryButton = By.xpath("//span[text()='Project Summary']");
	By editPersonalDetails = By.xpath("//span[text()='Edit Personel Details']");
	By projectHistory = By.xpath("//span[text()='Project History']");
	By reportingManagerHistory = By.xpath("//span[text()='Reporting Manager History']");
	By viewTimeline = By.xpath("//span[text()='View Timeline']");

	public WebElement getProfilebutton() {
		return driver.findElement(profileButton);

	}

	public WebElement getElements() {
		return driver.findElement(elements);

	}

	public WebElement getProfile() {
		return driver.findElement(profile);

	}

	public WebElement getcontainer() {
		return driver.findElement(imageContainer);

	}

	public WebElement getProjectSummaryButton() {
		return driver.findElement(projectSummaryButton);

	}

	public WebElement getPersonalDetailButton() {
		return driver.findElement(editPersonalDetails);

	}

	public WebElement getProjectHistoryButton() {
		return driver.findElement(projectHistory);

	}

	public WebElement getReportingManager() {
		return driver.findElement(reportingManagerHistory);

	}

	public WebElement getViewTimeline() {
		return driver.findElement(viewTimeline);

	}

}
