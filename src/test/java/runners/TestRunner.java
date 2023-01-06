package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinition",
        tags = "@CoinHouse",
        plugin = {"pretty", "html:target/reports/report3.html"}

)

public class TestRunner {
}
