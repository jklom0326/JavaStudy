package Chapter05.Part05;

public class MyListQueueTest {
    public static void main(String[] args) {
        MyLinkedQueue list = new MyLinkedQueue();
        list.enQueue("A");
        list.enQueue("B");
        list.enQueue("C");
        list.enQueue("D");

        list.printAll();
        list.deQueue();
        System.out.println(list.deQueue());
        System.out.println(list.deQueue());
        list.printAll();
    }
}
