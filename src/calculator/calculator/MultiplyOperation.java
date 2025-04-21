package calculator.calculator;
import calculator.Calculation;

public class MultiplyOperation implements Calculation{
    @Override
    public int calculation(int input1, int input2) {
        return input1 * input2;
    }
}
