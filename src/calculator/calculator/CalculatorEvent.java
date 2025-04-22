package calculator.calculator;

import calculator.Calculation;

import java.util.HashMap;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class CalculatorEvent  {
    public void performOperation() {
        Scanner calculatorInput = new Scanner(System.in);
        System.out.println("Enter Calculation: ");
        String input = calculatorInput.nextLine().replaceAll("\\s","");
        char operator = ' ';
        int operatorIndex =-1;

        for (int i = 0; i < input.length(); i++) {
            if ("+-*/".indexOf(input.charAt(i)) != -1) {
                operator = input.charAt(i);
                operatorIndex = i;
                break;
            }
        }
            if (operatorIndex == -1) {
                System.out.println("No operator Found.");
                return;
            }
            try {
                float input1 = Float.parseFloat(input.substring(0, operatorIndex));
                float input2 = Float.parseFloat(input.substring(operatorIndex + 1));

                float result = switch (operator) {
                    case '+' -> new AddOperation().calculation(input1, input2);
                    case '-' -> new SubtractOperation().calculation(input1, input2);
                    case '/' -> new DivideOperation().calculation(input1, input2);
                    case '*' -> new MultiplyOperation().calculation(input1, input2);
                    default -> throw new IllegalStateException("Unexpected operator: " + operator);
                };
                System.out.println("Result: " + result);

            } catch (NumberFormatException e) {
                System.out.println("Invalid numbers");
            }

        }


}
