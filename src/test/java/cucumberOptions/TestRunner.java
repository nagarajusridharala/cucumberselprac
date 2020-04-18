package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions", dryRun = false, monochrome = true,
        strict = true, tags = "@seleniumTests", plugin = { "pretty", "html:target/cucumber",
            "json:target/cucumber.json", "junit:target/Results.xml" })
// ~@smoke,~@regression,~@piv,~@mobileTest,~@webTest,smoke
public class TestRunner
{

}
