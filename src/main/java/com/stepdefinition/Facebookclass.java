package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebookclass {
	static WebDriver driver;

@Given("The user is in facebook login page")
public void the_user_is_in_facebook_login_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
}
    


@When("The user will enter the details{string},{string}")
public void the_user_will_enter_the_details(String email, String password) {
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("pass")).sendKeys(password);
    
}

@Then("The user will be in facebook homepage")
public void the_user_will_be_in_facebook_homepage() {
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
    
}


}
