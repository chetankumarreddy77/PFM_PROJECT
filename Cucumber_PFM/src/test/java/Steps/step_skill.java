package Steps;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages1.Home;
import Pages1.Login;
import Pages1.Skill;
import ReportingUtil.Reporters;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step_skill {
	WebDriver driver;
	Reporters R1;
	
	Login LP;
	Skill SP;
	Home  HP;

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 R1 = new Reporters();
		 R1.CreateHTMLReport("SkillReports");
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		LP = new Login();
		LP.driver(driver,R1);
		LP.user_opens_url(url);
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) throws InterruptedException, IOException {
		LP.user_enters_username_as_and_password_as(username, password);
	}

	@Then("Navigate to SKILLS Page")
	public void navigate_to_skills_page() throws InterruptedException {
		  SP = new Skill();
		  SP.driver(driver,R1);
		  SP.navigate_to_skills_page();

	}

	@When("Add SKILLS Records with SNAME as {string} AND SDESCR as {string}")
	public void add_skills_records_with_sname_as_and_sdescr_as(String Skill_name, String Skill_desc) throws InterruptedException, IOException {
		SP.add_skills_records_with_sname_as_and_sdescr_as(Skill_name, Skill_desc);
	}

	@When("Click on logout button")
	public void click_on_logout_button() throws InterruptedException {
		HP = new Home();
		HP.driver(driver,R1);
		HP.click_on_logout_button();
	}

	@Then("Close Browser")
	public void close_browser() {
		HP.close_browser();
	}

}
