import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.ProfilePageObjects;
import Objects.ProjectSummaryObjects;
import Objects.UploadImageObjects;
import library.Browser;

public class Test_ProfilePage {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static ProfilePageObjects pro;
	public static UploadImageObjects upl;
	public static ProjectSummaryObjects pso;

	@BeforeTest
	public void setUp() throws IOException {
		Browser browser = new Browser(driver);
		driver = browser.init();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		this.pro = new ProfilePageObjects(driver);
		this.upl = new UploadImageObjects(driver);
		this.pso = new ProjectSummaryObjects(driver);
		browser.navigateTo();
		browser.login();
	}

	@Test(priority = 1)
	public void profilePage() throws InterruptedException {
		Thread.sleep(3000);
		pro.getProfilebutton().click();
		System.out.println(pro.getElements().getText());
		Thread.sleep(2000);
		pro.getProfile().click();
		boolean image = pro.getcontainer().isDisplayed();
		Assert.assertEquals(image, true);
		boolean projectSummary = pro.getProjectSummaryButton().isDisplayed();
		Assert.assertEquals(projectSummary, true);
		boolean editPersonalDetails = pro.getPersonalDetailButton().isDisplayed();
		Assert.assertEquals(editPersonalDetails, true);
		boolean projectHistory = pro.getProjectHistoryButton().isDisplayed();
		Assert.assertEquals(projectHistory, true);
		boolean reportingManagerHistory = pro.getReportingManager().isDisplayed();
		Assert.assertEquals(reportingManagerHistory, true);
		boolean viewTimeline = pro.getViewTimeline().isDisplayed();
		Assert.assertEquals(viewTimeline, true);
	}

	@Test(priority = 2)
	public void uploadProfileImage() throws InterruptedException {

		upl.getUploadImage().sendKeys("C:\\Users\\Kashish goyal\\Downloads\\Image.jpg");
		Thread.sleep(2000);
		boolean msgbox = upl.getmessagebbox().isDisplayed();
		// assert successfully uploaded popup message box
		Assert.assertEquals(msgbox, true);
		upl.getOkButton().click();

	}

	@Test(priority = 3)
	public void testProjectSummaryButton() throws InterruptedException {
		pso.getProjectSummaryButton().click();
		boolean b1 = pso.getPage().isDisplayed();
		Assert.assertEquals(b1, true);
		System.out.println(b1);
	}

//	@Test(priority = 4)
//	public void testPersonalDetailsButton() {
//		driver.findElement(By.id("button-1295-btnInnerEl")).click();
//		boolean b3 = driver.findElement(By.id("editpersoneldetailwindow-1375")).isDisplayed();
//		Assert.assertEquals(b3, true);
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//div[@id='combobox-1483-trigger-picker']"))).click().build()
//				.perform();
//	}
//
//	@Test(priority = 5)
//	public void testProjectHistoryButton() {
//		driver.findElement(By.id("button-1297-btnInnerEl")).click();
//		Assert.assertEquals(false, null);
//	}
//
//	@Test(priority = 6)
//	public void testReportingHistoryButton() {
//		driver.findElement(By.id("button-1298-btnInnerEl")).click();
//	}
//
}
