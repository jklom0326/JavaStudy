package Chpater06;

class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass(){
        inClass = new InClass();
    }

    class InClass{
        int iNum = 100;

        // 스태틱변수가 오류남 outclass생성된 뒤에 생성된다
//        static int sInNum = 500;
        void inTest(){
            System.out.println("OutClass num = " + num+"(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + num+"(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + num+"(내부 클래스의 인스턴스 변수)");
        }
    }
    public void usingClass(){
        inClass.inTest();
    }
}


public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingClass();
    }
}
