package co.com.rappi.test.basicoperationscalculator.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BasicOperationsCalculatorUx {
    public static Target SELECT_NUMBER = Target.the("Selection button of the number to operate option {0} ")
            .locatedBy("//*[@resource-id='com.android.calculator2:id/digit_{0}']");
    public static Target OPERATOR_DIVISION = Target.the("select division as operator")
            .located(By.xpath("//*[@resource-id='com.android.calculator2:id/op_div']"));
    public static Target MULTIPLICATION_OPERATOR = Target.the("select multiplier as operator")
            .located(By.xpath("//*[@resource-id='com.android.calculator2:id/op_mul']"));
    public static Target OPERATOR_SUBTRACT = Target.the("select subtraction as operator")
            .located(By.xpath("//*[@resource-id='com.android.calculator2:id/op_sub']"));
    public static Target SUM_OPERATOR = Target.the("select sum as operator")
            .located(By.xpath("//*[@resource-id='com.android.calculator2:id/op_add']"));
    public static Target EQUALS = Target.the("select equal to get the result")
            .located(By.xpath("//*[@resource-id='com.android.calculator2:id/eq']"));
    public static Target INPUT_RESULTADO = Target.the("Operation result")
            .located(By.xpath("//*[@resource-id='com.android.calculator2:id/result']"));

    private BasicOperationsCalculatorUx() {
    }
}