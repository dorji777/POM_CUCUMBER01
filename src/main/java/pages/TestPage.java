package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestPage {

	WebDriver driver; 
	 public TestPage(WebDriver driver) {
	  this.driver = driver;
	 }
	 // Element Library
	 @FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]") WebElement SetSkyBlueBG;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]") WebElement SetWhiteBackGround;
	 

	 // Methods to interact with the elements
	 public void clickSkyBlue() {
		 SetSkyBlueBG.click();
		 
		 
	 }
	 public void clickSkyWhite() {
		 SetWhiteBackGround.click();
		 
	 }

}
