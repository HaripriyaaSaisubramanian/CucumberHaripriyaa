package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTariffplan {
	static WebDriver driver;

@Given("The user will be in  guru telecom homepage")
public void the_user_will_be_in_guru_telecom_homepage() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://demo.guru99.com/telecom/");
}

@Given("The user will click add tariff plan")
public void the_user_will_click_add_tariff_plan() {
	 driver.findElement(By.xpath("(//a[@href='addtariffplans.php'])[1]")).click();

   
}

@When("The will fill all datas")
public void the_will_fill_all_datas() {
	driver.findElement(By.id("rental1")).sendKeys("2000");
	driver.findElement(By.id("local_minutes")).sendKeys("10000");
	driver.findElement(By.id("inter_minutes")).sendKeys("10000");
	driver.findElement(By.id("sms_pack")).sendKeys("3000");
	driver.findElement(By.id("minutes_charges")).sendKeys("1");
	driver.findElement(By.id("inter_charges")).sendKeys("1");
	driver.findElement(By.id("sms_charges")).sendKeys("1");
 
}

@When("The user will submit")
public void the_user_will_submit() {
	 driver.findElement(By.xpath("//input[@type='submit']")).click();

}

@Then("I validate the message")
public void i_validate_the_message() {
    driver.findElement(By.xpath("//h2[contains(text(),'Congratulation')]")).getText();
}

}
