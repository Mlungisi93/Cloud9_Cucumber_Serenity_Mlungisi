package com.expleo.qe;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources",
        glue= "com/expleo/qe/stepdefinitions"
)
public class RunnerTest {
}
