package org.naic.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"html:target/reports/cucumber-report.html",
        "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "org/naic/step_definitions",
        dryRun = false,
        tags = ""

)
public class CucumberRunner {
}
