package assingment2;

import assignment1.MyArrayList;

class MyQueue<E> {
    private MyArrayList<E> elements;
    private int index; // provide add / remove Method
    private final static int defaultCapacity = 5;
    private int front; // team head
    private int rear; // End team

    public MyQueue() {
        this.elements = new MyArrayList<>();
    }

    public MyQueue(int capacity) {
        this.elements = new MyArrayList<>(capacity);
    }

    public E dequeue() {
        if (isEmpty()) {
            System.exit(-1);
        }

        return elements.remove(0);
    }

    public void enqueue(E item) {
        elements.add(item);
    }

    public E peek() {
        if (isEmpty()) {
            System.exit(-1);
        }
        return elements.get(0);
    }

    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

}