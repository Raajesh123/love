package org.emp;

import java.time.Duration;
import java.util.Date;

import org.demo.Sample;
import org.lan.Pojoclass1;
import org.lan.Pojoclass2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends Sample{
	@Given("User have to launch restockit restockit.featureurl")
	public void user_have_to_launch_restockit_restockit_featureurl() {
		
	    Date d=new Date();
	    System.out.println(d);
	}

	@When("User have to Valid {string} and {string}")
	public void user_have_to_Valid_and(String email, String pass) {
		Pojoclass1 p1=new Pojoclass1();
		loginnn(p1.getEnter());
		sendthevalue(p1.getLogin(), email);
		sendthevalue(p1.getPassword(), pass);
		loginnn(p1.getSignup());
	}

	@When("User have to check the correct and incorrect page")
	public void user_have_to_check_the_correct_and_incorrect_page() {
	    Date d=new Date();
	}

	@Then("Close the url")
	public void close_the_url() {
		//close();
	}

	@Given("Launch the restockit URL")
	public void launch_the_restockit_URL() {
		chromebrowser();
	    getcurrent();
	    currenttheurl("https://www.restockit.com/");
	}

	@When("User have to validate username and password")
	public void user_have_to_validate_username_and_password() {
	  Pojoclass1 p1=new Pojoclass1();
	  loginnn(p1.getEnter());
	  sendthevalue(p1.getLogin(), "rajesh.eie94@gmail.com");
	  sendthevalue(p1.getPassword(), "rajesh@1994");
	  loginnn(p1.getSignup());
	}

	@When("Choose the product and add to cart")
	public void choose_the_product_and_add_to_cart() {
	    Pojoclass2 p2=new Pojoclass2();
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	    js.executeScript("arguments[0].click()", p2.getCart());
	    js.executeScript("arguments[0].click()", p2.getCart1());
	    js.executeScript("arguments[0].click()", p2.getCart2());
	}

	@Then("check if the product is added in cart")
	public void check_if_the_product_is_added_in_cart() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement text = driver.findElement(By.xpath("//div[text()='Item #: SAN1884739']"));
		boolean select = text.isDisplayed();
		System.out.println(select);
	}

	

	
}
