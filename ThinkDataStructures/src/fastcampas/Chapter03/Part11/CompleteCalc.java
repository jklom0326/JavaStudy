package Chapter03.Part11;

public class CompleteCalc extends Calculator {
    @Override
    public int multi(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num1 == 0) {
            return ERROR;
        }
        return num1 / num2;
    }
}
