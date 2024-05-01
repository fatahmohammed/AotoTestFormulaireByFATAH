package StepDef;


import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature", glue = {"StepDef"},
        monochrome = true,
        plugin = {"pretty", "junit:traget/JUnitReports/report.xml",
                "json:traget/JSONReports/report.json",
                "html:traget/HTMLReports/report.html"},
        tags = "@smoketest or @caserreur"

)


public class TestRun {

}

