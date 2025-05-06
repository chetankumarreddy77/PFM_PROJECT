package Pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReportingUtil.Reporters;

public class Home {
	
	WebDriver driver;
	Reporters R1;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span")
	WebElement Profile;
//	@FindBy(xpath ="<a href=\"/web/index.php/auth/logout\" role=\"menuitem\" class=\"oxd-userdropdown-link\">Logout</a>")
//	WebElement LogoutBtn;
	
	
	public void driver(WebDriver driver01,Reporters R2) {
	this.driver = driver01;
	this.R1 = R2;
	PageFactory.initElements(driver01,this);
	}
	
	
	public void click_on_logout() throws InterruptedException {
		Profile.click();
		Thread.sleep(5000);
//		LogoutBtn.click();
//	    Thread.sleep(2000);
	}
	
	public void user_close_the_browser() {
		
		R1.closeReport();
	    driver.quit();
	}

	
}
