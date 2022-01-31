package steps;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestBase;
import pages.TestPage;

public class LoginStepDefination extends TestBase {

	
	
	TestPage testpage;
	
	@Before
	public void test() {
		initDriver();
		testpage= PageFactory.initElements(driver,TestPage.class);
		
	}
	
	@Given ("Set SkyBlue Background button exists")
			
	public void set_SkyBlue_Background_button_exists() {
		driver.get("http://techfios.com/test/101/");
    
} 
	
	@When ("I click on the button;")	
	public void i_click_on_the_button() throws IOException, Throwable {
		Thread.sleep(2000);
	}

	@Then("the background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {

		testpage.clickSkyBlue();
		Thread.sleep(3000);
}
	
///////White
	
/*	
	@Given ("Set SkyWhite Background button exists")
	public void set_SkyWhite_Background_button_exists() {
		driver.get("http://techfios.com/test/101/");
		testpage.clickSkyBlue();	
    
} 
	
	
	@When ("I click on the button2")	
	public void i_click_on_the_button2() throws IOException, Throwable {
		Thread.sleep(2000);
	}
*/
	
	@Then ("the background color will change to white")
	public void the_background_color_will_change_to_white() {
		
		testpage.clickSkyWhite();
		
}
	
}