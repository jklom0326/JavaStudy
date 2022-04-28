package Chapter03.Part09;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new DeskTop();
        computer.turnOn();
        computer.turnOff();

        NoteBook noteBook = new MyNoteBook();
        noteBook.turnOn();
    }
}
