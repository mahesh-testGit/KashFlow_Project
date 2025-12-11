package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/kashflow.test.features/VinaykBank.feature",glue={"come.stepDefinations"})
public class Runner {
}
