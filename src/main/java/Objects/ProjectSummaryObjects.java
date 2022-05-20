package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProjectSummaryObjects {
	public WebDriver driver;

	public ProjectSummaryObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By getProjectSummaryButton = By.id("button-1294-btnInnerEl");
	By getPage = By.className("x-css-shadow");

	public WebElement getProjectSummaryButton() {
		return driver.findElement(getProjectSummaryButton);
	}

	public WebElement getPage() {
		return driver.findElement(getPage);
	}

}
