package StepDef;

import io.cucumber.core.options.CucumberOptionsAnnotationParser;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature",glue={"StepDef"},
monochrome = true,
        plugin = {"pretty","junit:traget/JUnitReports/report.xml",
        "json:traget/JSONReports/report.json",
        "html:traget/HTMLReports/report.html"},
tags = "@smoketest"
)


public class TestRun {

}
