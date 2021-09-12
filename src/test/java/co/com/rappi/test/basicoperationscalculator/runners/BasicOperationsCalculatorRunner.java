package co.com.rappi.test.basicoperationscalculator.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/basic_operations_calculator.feature",
        glue = "co.com.rappi.test.basicoperationscalculator.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class BasicOperationsCalculatorRunner {

}