package Chapter05.Part07;



public class GenericPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(powder);

        // 컴파일될떄 T를 전부 Powder로 바꿔주기 때문에 형변환이 필요가 없다.
        Powder p = powderPrinter.getMaterial();
        System.out.println(powderPrinter.toString());

    }
}
