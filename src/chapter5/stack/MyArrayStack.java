package chapter5.stack;

import chapter5.array.MyArray;

public class MyArrayStack {

    MyArray arrayStack;
    int top;

    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size) {
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data) {

        if (isFull()) {
            System.out.println("stack is full");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }

    public int pop() {

        if( top == 0 ) {
            System.out.println("stack is full");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.removeElement(--top);
    }

    public int peek() {

        if( top == 0 ) {
            System.out.println("stack is full");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.getElement(--top);
    }

    public boolean isEmpty() {
        if(top == 0) {
            return true;
        } else return false;
    }

    public boolean isFull() {

        if (top == arrayStack.ARRAY_SIZE) {
            return true;
        } else {
            return false;
        }
    }

    public void printAll() {
        arrayStack.printAll();
    }

}
