package Pages2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReportingUtil.Reporters;

public class Job {
	
	WebDriver driver;
	Reporters R1;
	
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement Admin;
	@FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")
	WebElement Job;
	@FindBy(xpath = "//a[contains(text(),'Titles')]")
	WebElement JobTitles;
	@FindBy(xpath = "//button[text()=' Add ']")
	WebElement AddBtn;
	@FindBy(xpath = "(//input[contains(@class,'oxd-input--active')])[2]")
	WebElement JobTittle;
	@FindBy(xpath = "(//textarea[contains(@class,'oxd-textarea--resize-vertical')])[1]")
	WebElement JobDes;
	@FindBy(xpath = "(//textarea[contains(@class,'oxd-textarea--resize-vertical')])[2]")
	WebElement JobNote;
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement SaveBtn;
	
	public void driver(WebDriver driver01, Reporters R2) {
		this.driver = driver01;
		this.R1 = R2;
		PageFactory.initElements(driver01,this);
	}
	
	public void user_click_the_admin() throws InterruptedException {
		Admin.click();
	    Thread.sleep(2000);
	}
	
	public void user_enter_the_jobs() throws InterruptedException {
		Job.click();
		Thread.sleep(2000);
		JobTitles.click();
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(2000);
	}
	
	public void user_enter_the_job_tittle_as_and_job_description_and_job_note(String JobTitle, String Job_Des, String Job_Note) throws InterruptedException, IOException {
		JobTittle.sendKeys(JobTitle);
	 	Thread.sleep(2000);
	 	JobDes.sendKeys(Job_Des);
	 	Thread.sleep(2000);
	 	JobNote.sendKeys(Job_Note);
	 	Thread.sleep(3000);
	 	R1.logger(driver, "Job_Data", "JobDetails");
	 	SaveBtn.click();
		Thread.sleep(2000);
	}

}
