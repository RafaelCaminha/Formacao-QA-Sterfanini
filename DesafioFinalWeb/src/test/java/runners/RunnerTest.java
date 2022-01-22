package runners;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {
        "pretty"
    },
    snippets = SnippetType.CAMELCASE,
    monochrome = true,
    dryRun = false,
    features = "src/test/resources/features",
    glue = "stepsDefinitions",
    // tags = "@LoginSucesso",
    publish = false
)
public class RunnerTest {
    

}
