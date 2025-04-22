package calculator.calculator;

import calculator.Calculation;

class SubtractOperation implements Calculation{
    public float result;
    @Override
    public float calculation(float input1, float input2) {
        result = input1 - input2;
        return result;
    }
}