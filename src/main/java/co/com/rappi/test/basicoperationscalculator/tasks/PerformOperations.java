package co.com.rappi.test.basicoperationscalculator.tasks;

import co.com.rappi.test.basicoperationscalculator.interactions.SelectOperator;
import co.com.rappi.test.basicoperationscalculator.models.OperationsInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import java.util.List;

import static co.com.rappi.test.basicoperationscalculator.userinterfaces.BasicOperationsCalculatorUx.EQUALS;
import static co.com.rappi.test.basicoperationscalculator.userinterfaces.BasicOperationsCalculatorUx.SELECT_NUMBER;

public class PerformOperations implements Task {

    private List<OperationsInformation> dataOperations;

    public PerformOperations(List<OperationsInformation> dataOperations) {
        this.dataOperations = dataOperations;
    }

    public static PerformOperations inTheAppCalculator(List<OperationsInformation> dataOperations) {
        return Tasks.instrumented(PerformOperations.class, dataOperations);
    }

    @Step("{0} enter to perform operations in the app calculator ")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_NUMBER.of(dataOperations.get(0).getNumberOne())),
                SelectOperator.inTheAppCalculator(dataOperations),
                Click.on(SELECT_NUMBER.of(dataOperations.get(0).getNumberTwo())),
                Click.on(EQUALS));
    }
}