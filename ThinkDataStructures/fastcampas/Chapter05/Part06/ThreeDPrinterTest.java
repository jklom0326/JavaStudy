package Chapter05.Part06;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        ThreeDPrinter3 printer = new ThreeDPrinter3();

        printer.setMaterial(powder);
        // 오브젝트타입으로 선언하면 형변환을 해줘야 사용가능함함
       Powder p = (Powder) printer.getMaterial();
    }
}
