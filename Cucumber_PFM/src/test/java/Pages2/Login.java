package Pages2;

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
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement USERNAME;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	WebElement PASSWORD;
	@FindBy(xpath = "//button[contains(@type,'submit')]")
	WebElement LOGIN;
	
	public void driver(WebDriver driver01, Reporters R2) {
		this.driver = driver01;
		this.R1 = R2;
		
		PageFactory.initElements(driver01,this);
	}
	
	public void user_enter_login_id_as_and_login_password_as(String id, String pass) throws InterruptedException, IOException {
		USERNAME.sendKeys(id);
		Thread.sleep(2000);
		PASSWORD.sendKeys(pass);
		Thread.sleep(2000);
		R1.logger(driver, "LOGINDETAILS", "SUCCESSFULLLOGIN");
		LOGIN.click();
		Thread.sleep(2000);
	}
	
	public void user_enter_the_url_as(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
