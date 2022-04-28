package Chapter05.Part05;

import Chapter05.Part03.MyLinkedList;
import Chapter05.Part03.MyListNode;

interface Queue {
    public void enQueue(String data);

    public String deQueue();

    public void printQueue();
}

public class MyLinkedQueue extends MyLinkedList implements Queue {

    MyListNode front;
    MyListNode rear;

    @Override
    public void enQueue(String data) {
        MyListNode newNode;
        if (isEmpty()) {
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        } else {
            newNode = addElement(data);
            rear = newNode;
        }
        System.out.println(newNode.getData() + " Added");
    }

    @Override
    public String deQueue() {
        if (isEmpty()) {
            return null;
        }
        String data = front.getData();
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return data;
    }

    @Override
    public void printQueue() {
        printAll();
    }

}
