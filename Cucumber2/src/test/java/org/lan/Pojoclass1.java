package org.lan;

import org.demo.Sample;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass1 extends Sample{
public Pojoclass1() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Sign In']")
private WebElement enter;

@FindAll({@FindBy(xpath="//input[@type='email']"),
	@FindBy(xpath="//span[text()='Please enter your e-mail address.']")})
private WebElement login;
@FindBy(xpath="//input[@type='password']")
private WebElement password;
public WebElement getEnter() {
	return enter;
}


public WebElement getLogin() {
	return login;
}


public WebElement getPassword() {
	return password;
}





public WebElement getSignup() {
	return signup;
}


public WebElement getAdd() {
	return add;
}

@FindBy(xpath="//input[@value='Sign in']")
private WebElement signup;


@FindBy(xpath="(//*[text()='Add to cart'])[1]")
private WebElement add;



}
