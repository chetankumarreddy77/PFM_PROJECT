package Pages3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReportingUtil.Reporters;

public class Nation {
	
WebDriver driver;
Reporters R1;
	
	@FindBy(xpath="//span[text()='Admin']")
	WebElement ADMIN;
	@FindBy(xpath="//a[text()='Nationalities']")
	WebElement NATION;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
	WebElement ADDBTN;
	@FindBy(xpath="(//input[contains(@class,'oxd-input--active')])[2]")
	WebElement NATIONNAME;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
	WebElement SAVEBTN;
	
	public void driver(WebDriver driver02, Reporters R2) {
		this.driver = driver02;
		this.R1 = R2;
		PageFactory.initElements(driver02,this);
	}
	
	
	public void browse_to_nationality_page() throws InterruptedException {
		ADMIN.click();
	    Thread.sleep(2000);
	    NATION.click();
		Thread.sleep(2000);
		ADDBTN.click();
		Thread.sleep(2000);
	}
	
	public void add_nationality_records_with_nname_as(String Nation_name) throws InterruptedException, IOException {
		NATIONNAME.sendKeys(Nation_name);
		Thread.sleep(3000);
		R1.logger(driver, "Nation_name", "Nation_Report");
		SAVEBTN.click();
		Thread.sleep(5000);
	}

}
