package calculator.calculator;

import calculator.Calculation;

import java.util.HashMap;

import java.util.Map;
import java.util.Optional;

public class CalculatorEvent {

    private Map<String, Calculation> calculations = new HashMap<>();

    public CalculatorEvent(){
        calculations.put("+", new AddOperation());
        calculations.put("-", new SubtractOperation());
        calculations.put("*", new MultiplyOperation());
        calculations.put("/", new DivideOperation());
    }

    public void performOperation(String operator, int input1, int input2) {
        if (calculations.containsKey(operator)) {
            Calculation calculation = calculations.get(operator);
            int result = calculation.calculation(input1, input2);
            System.out.println(input1 + " " + operator + " " + input2 + " = " + result);
        } else {
            System.out.println("Invalid operator: " + operator);
        }
    }
}
