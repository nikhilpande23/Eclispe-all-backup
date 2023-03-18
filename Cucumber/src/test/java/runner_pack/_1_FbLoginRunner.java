package runner_pack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions
(
		features = "src/test/resources/features_pack",
		glue = "stepDefination_pack",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty","html:target/Reports_Folder/report1.html"}
		
)


public class _1_FbLoginRunner {

}
