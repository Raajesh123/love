package org.lan;

import org.demo.Sample;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass2 extends Sample{
public Pojoclass2() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[contains(text(),'Fine Tip Permanent Marker, Black, 36/Pack (SAN1884739)')]")
private WebElement cart;

@FindBy(xpath="(//a[text()='Add to cart'])[1]")
private WebElement cart1;

@FindBy(xpath="//*[text()='Checkout']")
private WebElement cart2;

public WebElement getCart() {
	return cart;
}

public WebElement getCart1() {
	return cart1;
}

public WebElement getCart2() {
	return cart2;
}




}

