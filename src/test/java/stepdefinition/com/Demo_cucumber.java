package stepdefinition.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Demo_cucumber {
	static WebDriver driver;

	@Given("In selenium easy home page")
	public void in_selenium_easy_home_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\home\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
	}

	@Given("Click input forms")
	public void click_input_forms() {
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();

	}

	@When("Insert all the details")
	public void insert_all_the_details(DataTable simpletext) throws Throwable {
		List<String> text = simpletext.asList(String.class);
		System.out.println(text);
		driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2]")).click();
		driver.findElement(By.id("user-message")).sendKeys(text.get(0));
		driver.findElement(By.id("sum1")).sendKeys(text.get(1));
		driver.findElement(By.id("sum2")).sendKeys(text.get(2));
		Thread.sleep(50000);
	}

	@Then("Validate the outcomes")
	public void validate_the_outcomes() {
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();

	}

	@When("Select the required options")
	public void select_the_required_options() {
		driver.findElement(By.xpath("(//a[text()='Checkbox Demo'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();

	}

	@Then("Validate the required outcomes")
	public void validate_the_required_outcomes() {
		driver.findElement(By.id("check1")).click();
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("executed till check box");
	}

	@When("I complete action")
	public void i_complete_action() throws Throwable {
		driver.findElement(By.xpath("(//a[text()='Radio Buttons Demo'])[2]")).click();
		driver.findElement(By.xpath("(//input[@value='Female'])[1]")).click();
		driver.findElement(By.xpath("(//input[@value='Female'])[2]")).click();
		driver.findElement(By.xpath("(//input[@name='ageGroup'])[3]")).click();
		Thread.sleep(50000);

		
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		driver.findElement(By.id("buttoncheck")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	}

}
