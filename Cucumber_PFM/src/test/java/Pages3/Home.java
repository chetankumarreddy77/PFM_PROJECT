package Pages3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReportingUtil.Reporters;

public class Home {
	
WebDriver driver;
Reporters R1;

	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span")
	WebElement PROFILE;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")
	WebElement LOGOUT;
	
	public void driver(WebDriver driver02, Reporters R2) {
		this.driver = driver02;
		this.R1 = R2;
		PageFactory.initElements(driver02,this);
	}
	
	
	public void click_on_logout_button() throws InterruptedException {
		PROFILE.click();
	    Thread.sleep(3000);
	    LOGOUT.click();
	    Thread.sleep(2000);
	}
	
	public void close_browser() {
		R1.closeReport();
	    driver.quit();
	}

}
