package Pages3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReportingUtil.Reporters;

public class Login {
	
	WebDriver driver;
	Reporters R1;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement LOGIN;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	WebElement PASSWORD;
	@FindBy(xpath="//button[contains(@type,'submit')]")
	WebElement LOGINBTN;
	
	public void driver(WebDriver driver02, Reporters R2) {
		this.driver = driver02;
		this.R1 = R2;
		PageFactory.initElements(driver02,this);
	}

	public void user_enters_username_as_and_password_as(String Id, String Pass) throws InterruptedException, IOException {
		LOGIN.sendKeys(Id);
		Thread.sleep(2000);
		PASSWORD.sendKeys(Pass);
		Thread.sleep(2000);
		R1.logger(driver, "LOGIN_Details", "LOGIN_Report");
		LOGINBTN.click();
		Thread.sleep(2000);
	}
	
	
	public void user_opens_url(String url) throws InterruptedException {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
}
