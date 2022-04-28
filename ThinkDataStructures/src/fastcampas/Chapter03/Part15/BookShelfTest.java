package Chapter03.Part15;

public class BookShelfTest {
    public static void main(String[] args) {

        Queue bookqueue = new BookShelf();
        bookqueue.enQueue("토지1");
        bookqueue.enQueue("토지2");
        bookqueue.enQueue("토지3");
        bookqueue.enQueue("토지4");
        bookqueue.enQueue("토지5");

        System.out.println(bookqueue.getSize());
        System.out.println(bookqueue.deQueue());
        System.out.println(bookqueue.deQueue());
        System.out.println(bookqueue.deQueue());
        System.out.println(bookqueue.deQueue());
        System.out.println(bookqueue.deQueue());
    }
}
