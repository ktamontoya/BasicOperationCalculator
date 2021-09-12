package co.com.rappi.test.basicoperationscalculator.stepdefinitions;

import co.com.rappi.test.basicoperationscalculator.models.OperationsInformation;
import co.com.rappi.test.basicoperationscalculator.questions.CompareResult;
import co.com.rappi.test.basicoperationscalculator.tasks.PerformOperations;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BasicOperationsCalculatorStepDefinition {
    @Given("^that the user is using the calculator$")
    public void thatTheUserIsUsingTheCalculator() {
        setTheStage(new OnlineCast());
        theActorCalled("El usuario");
    }

    @When("^he decides to perform an operation$")
    public void heDecidesToPerformAnOperation(List<OperationsInformation> dataOperations) {
        theActorInTheSpotlight().attemptsTo(
                PerformOperations.inTheAppCalculator(dataOperations));
    }

    @Then("^he will visualize the corresponding result$")
    public void heWillVisualizeTheCorrespondingResult(List<OperationsInformation> dataOperations) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                CompareResult.afterTheOperation(), Matchers.equalTo(dataOperations.get(0).getResult())));
    }
}
