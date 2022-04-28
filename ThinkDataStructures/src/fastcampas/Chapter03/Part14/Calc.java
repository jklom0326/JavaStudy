package Chapter03.Part14;

public interface Calc {

    Double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int multi(int num1, int num2);
    int divide(int num1, int num2);

    default void description(){
        System.out.println("정수 계산기를 구현합니다.");
    }

    static int total(int[] arr){
        int total = 0;
        for (int num : arr){
            total += num;
        }
        return total;
    }

}
