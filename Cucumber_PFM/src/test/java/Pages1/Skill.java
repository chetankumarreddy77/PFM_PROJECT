package Pages1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReportingUtil.Reporters;

public class Skill {
	
	WebDriver driver;
	Reporters R1;
	
	@FindBy(xpath="(//span[contains(@class,'oxd-text oxd-text--span oxd-main-menu-item--name')])[1]")
	WebElement ADMIN;
	@FindBy(xpath="//span[contains(text(),'Quali')]")
	WebElement QUALIFICATIONS;
	@FindBy(xpath="//a[contains(text(),'Skills')]")
	WebElement SKILL;
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement ADDBTN;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement SKILLNAME;
	@FindBy(xpath="//textarea[starts-with(@placeholder,'Type description here')]")
	WebElement SKILLDESC;
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement SAVEBTN;
	
	public void driver(WebDriver driver01, Reporters R2) {
		this.driver = driver01;
		this.R1 = R2;
		PageFactory.initElements(driver01, this);
	}
	
	public void navigate_to_skills_page() throws InterruptedException {
		  ADMIN.click();
		  Thread.sleep(2000);
		  QUALIFICATIONS.click();
		  Thread.sleep(2000);
		  SKILL.click();
		  Thread.sleep(2000);

	}
	public void add_skills_records_with_sname_as_and_sdescr_as(String Skill_name, String Skill_desc) throws InterruptedException, IOException {
		ADDBTN.click();
		Thread.sleep(2000);
		R1.logger(driver,"AddBTN Click", "AddingSkilldata");
		SKILLNAME.sendKeys(Skill_name);
		Thread.sleep(2000);
		SKILLDESC.sendKeys(Skill_desc);
		Thread.sleep(2000);
		R1.logger(driver,"SkillData", "Entered Skill data");
		SAVEBTN.click();
	}

}
