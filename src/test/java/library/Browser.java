package library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public WebDriver driver;
	String browser, url, username, password;
	WebDriverWait wait;
	Properties prop = new Properties();

	public Browser(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver init() throws IOException {
		FileInputStream fls = new FileInputStream(
		"C:/Users/Kashish goyal/eclipse-workspace/DDO_Project/resources/base.properties");
		prop.load(fls);
		this.browser = prop.getProperty("browser");
		driver = init(browser);
		return driver;

	}

	public WebDriver init(String browserType) {
		if (browserType.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserType.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserType.equalsIgnoreCase("msedge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		return driver;
	}

	public void navigateTo() {
		this.url = prop.getProperty("url");
		driver.get(url);
	}

	public void login() {
		this.username = prop.getProperty("username");
		this.password = prop.getProperty("password");
		driver.findElement(By.id("button-1021-btnEl")).click();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("kc-login")).click();
	}

	public void close() {
		driver.close();
	}
}
