package Chapter03.Part09;

public class DeskTop extends Computer{
    @Override
    void display() {
        System.out.println("DeskTop display");
    }

    @Override
    void typing() {
        System.out.println("DeskTop typing");
    }

    @Override
    public void turnOn() {
        System.out.println("DeskTop On");
    }

    @Override
    public void turnOff() {
        System.out.println("DeskTop Off");
    }
}
