package Step1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages2.Home;
import Pages2.Job;
import Pages2.Login;
import ReportingUtil.Reporters;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Job {
	
	WebDriver driver;
	Reporters R1;
	
	Login LP;
	Job   JP;
	Home  HP;
	
	@Given("User launch the chrome browser")
	public void user_launch_the_chrome_browser() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    R1 = new Reporters();
	    R1.CreateHTMLReport("JobReports");
	    
	}
	@Then("User Enter the URL as {string}")
	public void user_enter_the_url_as(String url) {
		LP = new Login();
		LP.driver(driver, R1);
		LP.user_enter_the_url_as(url);
	}
	@When("user enter Login id as {string} and Login password as {string}")
	public void user_enter_login_id_as_and_login_password_as(String id, String pass) throws InterruptedException, IOException {
		LP.user_enter_login_id_as_and_login_password_as(id, pass);
	}
	@When("user Click the admin")
	public void user_click_the_admin() throws InterruptedException,IOException {
		JP = new Job();
		JP.driver(driver, R1);
		JP.user_click_the_admin();
	}
	@Then("user Enter the Jobs")
	public void user_enter_the_jobs() throws InterruptedException {
		JP.user_enter_the_jobs();
	}
	@When("user enter the Job tittle as {string} and Job Description {string} and Job note {string}")
	public void user_enter_the_job_tittle_as_and_job_description_and_job_note(String JobTitle, String Job_Des, String Job_Note) throws InterruptedException, IOException {
		JP.user_enter_the_job_tittle_as_and_job_description_and_job_note(JobTitle, Job_Des, Job_Note);
	}
	@Then("click on logout")
	public void click_on_logout() throws InterruptedException {
		HP = new Home();
		HP.driver(driver,R1);
		HP.click_on_logout();
	}
	@Then("user close the browser")
	public void user_close_the_browser() {
	    HP.user_close_the_browser();
	}

}
