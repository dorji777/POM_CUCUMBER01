package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
features = ".\\src\\test\\java\\features\\WebsiteLaunch.feature",
//features = "classpath:features",
//features = {"classpath:OtherLogin.feature","classpath:Bank&Cash.feature"},
glue = "steps",
tags = {"@Regression"},
monochrome  = true,
dryRun = false,
plugin = {
	"pretty",
	"html:target/cucumber",
	"json:target/cucumber.json"
}

)
public class TestRunner {

}
