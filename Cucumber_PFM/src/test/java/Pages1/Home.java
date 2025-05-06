package Pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReportingUtil.Reporters;

public class Home {
	
	WebDriver driver;
	Reporters R1;
	
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	WebElement PROFILE;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")
	WebElement LOGOUTBTN;
	
	public void driver(WebDriver driver01, Reporters R2) {
		this.driver= driver01;
		this.R1 = R2;
		PageFactory.initElements(driver01,this);
	}
	
	public void click_on_logout_button() throws InterruptedException {
		PROFILE.click();
	    Thread.sleep(2000);
	    LOGOUTBTN.click();
	    Thread.sleep(2000);
	}
	
	public void close_browser() {
		R1.closeReport();
		driver.quit();
	}
	

}
