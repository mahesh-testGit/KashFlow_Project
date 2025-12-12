package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml"
        },
        features = "src/test/resources/kashflow.test.features/VinaykBank.feature",
        glue = "come.stepDefinations"
)
public class Runner {
}





