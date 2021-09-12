package co.com.rappi.test.basicoperationscalculator.interactions;

import co.com.rappi.test.basicoperationscalculator.exceptions.NoExisteOperadorException;
import co.com.rappi.test.basicoperationscalculator.models.OperationsInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static co.com.rappi.test.basicoperationscalculator.userinterfaces.BasicOperationsCalculatorUx.*;
import static co.com.rappi.test.basicoperationscalculator.utils.ConstantsOfOperations.*;

public class SelectOperator implements Interaction {
    private List<OperationsInformation> dataOperations;

    public SelectOperator(List<OperationsInformation> dataOperations) {
        this.dataOperations = dataOperations;
    }

    public static SelectOperator inTheAppCalculator(List<OperationsInformation> dataOperations) {
        return Tasks.instrumented(SelectOperator.class, dataOperations);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (dataOperations.get(0).getOperation()) {
            case SUM:
                actor.attemptsTo(
                        Click.on(SUM_OPERATOR));
                break;
            case SUBTRACTION:
                actor.attemptsTo(
                        Click.on(OPERATOR_SUBTRACT));
                break;
            case MULTIPLICATION:
                actor.attemptsTo(
                        Click.on(MULTIPLICATION_OPERATOR));
                break;
            case DIVISION:
                actor.attemptsTo(
                        Click.on(OPERATOR_DIVISION));
                break;
            default:
                throw new NoExisteOperadorException(dataOperations.get(0).getOperation());
        }
    }
}