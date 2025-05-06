package Step2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages3.Home;
import Pages3.Login;
import Pages3.Nation;
import ReportingUtil.Reporters;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Nationalitits {
	
	WebDriver driver;
	Reporters R1;
	
	Login LP;
	Nation NP;
	Home HP;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 R1 = new Reporters();
		 R1.CreateHTMLReport("Nationalities_Report");
	}
	@When("User opens URL {string}")
	public void user_opens_url(String url) throws InterruptedException {
		LP = new Login();
		LP.driver(driver,R1);
		LP.user_opens_url(url);
	}
	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String Id, String Pass) throws InterruptedException, IOException {
		LP.user_enters_username_as_and_password_as(Id, Pass);
	}
	@Then("browse to NATIONALITY Page")
	public void browse_to_nationality_page() throws InterruptedException {
		NP = new Nation();
		NP.driver(driver,R1);
		NP.browse_to_nationality_page();
	}
	@When("Add NATIONALITY Records with NNAME as {string}")
	public void add_nationality_records_with_nname_as(String Nation_name) throws InterruptedException, IOException {
		NP.add_nationality_records_with_nname_as(Nation_name);
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
