package Chapter03.Part14;

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
    public void showInfo(){
        System.out.println("모두 구현했습니다.");
    }

    @Override
    public void description() {
        System.out.println("CompleteCalc overriding");
    }
}
