package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( plugin= {"html:target/cucumberreport.html","pretty"},     //report
		features="src/test/java/features",
        glue ="StepDefinations",
        //monochrome=true,
        tags="@register"
		      ) 
public class Runner {

}
