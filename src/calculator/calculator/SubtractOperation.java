package calculator.calculator;

import calculator.Calculation;

class SubtractOperation implements Calculation {
    @Override
    public int calculation(int input1, int input2) {
        return input1 - input2;
    }
}