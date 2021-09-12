package co.com.rappi.test.basicoperationscalculator.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.rappi.test.basicoperationscalculator.userinterfaces.BasicOperationsCalculatorUx.INPUT_RESULTADO;

public class CompareResult implements Question<String> {
    public static CompareResult afterTheOperation() {
        return new CompareResult();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(INPUT_RESULTADO).viewedBy(actor).asString();
    }
}