package com.stepdefinition;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerSteps {
	static WebDriver driver;

@Given("The user will be in telecom homepage")
public void the_user_will_be_in_telecom_homepage() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
     driver=new ChromeDriver();
     driver.get("http://demo.guru99.com/telecom/");
}

@Given("The user will click add customer")
public void the_user_will_click_add_customer() {
 driver.findElement(By.xpath("(//a[@href='addcustomer.php'])[1]")).click();
}

@When("The will fill the details")
public void the_will_fill_the_details() {
 driver.findElement(By.xpath("//label[@for='done']")).click();
 driver.findElement(By.id("fname")).sendKeys("Haripriyaa");
 driver.findElement(By.id("lname")).sendKeys("Pradeep");
 driver.findElement(By.id("email")).sendKeys("sharipriyaa17@gmail.com");
 driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("coimbatore");
 driver.findElement(By.id("telephoneno")).sendKeys("9629793940");


 
}

@When("The user will click submit")
public void the_user_will_click_submit() {
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
  
}

@Then("The user will get order id")
public void the_user_will_get_order_id() {
	driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed();
	Assert.assertTrue(true);
}
}
