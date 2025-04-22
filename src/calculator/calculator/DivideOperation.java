package calculator.calculator;

import calculator.Calculation;

class DivideOperation implements Calculation {
    public float result;
    public String divideByZeroError = "Impossible Action!";
    @Override
    public float calculation(float input1, float input2) {
        if (input1 != 0 && input2 != 0) {
            result = input1 / input2;
            return result;
        } else {
            System.out.println(divideByZeroError);
        }
        return result;
    }

}