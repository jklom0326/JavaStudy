package Chapter03.Part10;

public class CarTest {
    public static void main(String[] args) {
        Car aiCar = new AiCar();
        aiCar.run();

        Car mCar = new ManualCar();
    }
}
