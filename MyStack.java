package assingment2;

import assignment1.MyLinkedList;

import java.util.EmptyStackException;

class MyStack<E> {
    private final MyLinkedList<E> elements;

    public MyStack(){
        elements = new MyLinkedList<>();
    }

    public void push(E value){
        elements.add(value);
    }

    public E pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return elements.remove(size() - 1);
    }

    public E peek(){
        if(isEmpty()){
            return null;
        }
        return elements.get(size() - 1);
    }

    public int size() {
        return elements.size();
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public String toString(){
        StringBuilder stringFormat = new StringBuilder("[");

        if (elements.isEmpty()) {
            return stringFormat + "]";
        }

        for (int i = size() - 1; i >= 0; i--) {
            stringFormat.append(elements.get(i));
            if (i > 0) {
                stringFormat.append(", ");
            }
        }
        return stringFormat + "]";
    }
}
