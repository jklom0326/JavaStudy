package Chapter02.Part14;

public class TestClass {
    public static void main(String[] args) {
        Student studentHan = new Student("한",7000);
        Student studentUm = new Student("엄",10000);

        Bus bus100 = new Bus(100);

        Subway greenSubway = new Subway(2);

        studentHan.takeBus(bus100);
        studentUm.takeBus(bus100);

        studentHan.takeSubway(greenSubway);

        studentHan.showInfo();
        studentUm.showInfo();
        bus100.showBusInfo();
        greenSubway.showSubwayInfo();

    }

}
