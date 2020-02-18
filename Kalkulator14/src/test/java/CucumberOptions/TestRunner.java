package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = "StepDefinitions",
        //tags = {"@now, @web"} //tagi ze spójnikiem "lub"
        tags = {"@now", "@web"} //tagi ze spójnikiem "i"
)
public class TestRunner {
}
