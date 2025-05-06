package Pages1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReportingUtil.Reporters;

public class Login {
	
	WebDriver driver;
	Reporters R1;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement USERNAME;
	@FindBy(name = "password")
	WebElement PASSWORD;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement LOGINBTN;
	
	
	public void driver(WebDriver driver01, Reporters R2) {
		this.driver = driver01;
		this.R1 = R2;
		PageFactory.initElements(driver01, this);
	}
	
	public void user_enters_username_as_and_password_as(String username, String password) throws InterruptedException, IOException {
		USERNAME.sendKeys(username);
		Thread.sleep(2000);
		PASSWORD.sendKeys(password);
		Thread.sleep(2000);
		R1.logger(driver, "LoginDetails", "LoginSuccessfull");
		LOGINBTN.click();
		Thread.sleep(2000);
	}
	
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
}
