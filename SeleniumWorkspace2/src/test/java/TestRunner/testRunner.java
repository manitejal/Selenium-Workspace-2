package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://SeleniumWorkspace2//Feature//Customer.feature",
        glue = "StepDefinitions",
        dryRun= false,
        //tags ={"@sanity, @regression"}

        monochrome = true,
        plugin = { "pretty", "html:target/cucumber/report.html" }
//        plugin = {"pretty", "html:test-output"}       //generating report
//        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" }
   //     plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
//      plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
//                    "junit:target/cucumber-reports/Cucumber.xml",
//                     "html:target/cucumber-reports"}
)
public class testRunner {

}
