package chapter5.queue;

import chapter5.linkedList.MyLinkedList;
import chapter5.linkedList.MyListNode;

interface Queue{
    void enQueue(String data);
    String deQueue();
    void printQueue();
}

public class MyLinkedQueue extends MyLinkedList implements Queue {

    MyListNode front;
    MyListNode rear;

    @Override
    public void enQueue(String data) {
        MyListNode newNode;
        if( isEmpty() ) {
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        } else {
            newNode = addElement(data);
            rear = newNode;
        }
        System.out.println(newNode.getData() + " added");
    }

    @Override
    public String deQueue() {
        if( isEmpty() ) {
            return null;
        }

        String data = front.getData();
        front = front.next;

        if(front == null) {
            rear = null;
        }
        return data;
    }

    @Override
    public void printQueue() {
        printAll();
    }
}
