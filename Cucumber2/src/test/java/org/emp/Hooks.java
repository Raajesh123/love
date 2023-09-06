package org.emp;

import org.demo.Sample;

import io.cucumber.java.Before;

public class Hooks extends Sample{
@Before
public void abc() {
	chromebrowser();
    
    currenttheurl("https://www.restockit.com/");

}
}
