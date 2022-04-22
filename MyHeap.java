package assingment2;

import assignment1.MyArrayList;

import java.util.NoSuchElementException;

class MyHeap<T> {
    private static final int d= 2;
    private final MyArrayList<T> heap;
    private int heapSize;

    public MyHeap(int capacity){
        heapSize = 0;
        heap = new MyArrayList<T>(capacity+1);
    }

    public boolean isEmpty(){
        return heapSize==0;
    }

    public boolean isFull(){
        return heapSize == heap.size();
    }

    private int parent(int i){
        return (i-1)/d;
    }

    private int kthChild(int i,int k){
        return d*i  +k;
    }

    public void add(T x){
        heap.add(x, heapSize++);
        heapifyUp(heapSize-1);
    }

    public T remove(int x){
        if(isEmpty())
            throw new NoSuchElementException("Heap is empty, No element to delete");
        T key = heap.get(x);
        heap.add(heap.get(heapSize -1), x);
        heapSize--;
        heapifyDown(x);
        return key;
    }

    private void heapifyUp(int i) {
        T temp = heap.get(i);
        while(i>0 && ((Comparable)temp).compareTo(heap.get(parent(i))) > 0) {
            heap.add(heap.get(parent(i)), i);
            i = parent(i);
        }
        heap.add(temp, i);
    }

    private void heapifyDown(int i){
        int child;
        T temp = heap.get(i);
        while(kthChild(i, 1) < heapSize){
            child = maxChild(i);
            if(((Comparable)temp).compareTo(heap.get(child)) < 0){
                heap.add(heap.get(child), i);
            }else
                break;

            i = child;
        }
        heap.add(temp, i);
    }

    private int maxChild(int i) {
        int leftChild = kthChild(i, 1);
        int rightChild = kthChild(i, 2);

        return ((Comparable)heap.get(leftChild)).compareTo(heap.get(rightChild))>0?leftChild:rightChild;
    }

    public void printHeap()
    {
        System.out.print("\nHeap = ");
        for (int i = 0; i < heapSize; i++)
            System.out.print(heap.get(i) +" ");
        System.out.println();
    }

    public T removeRoot(){
        if(isEmpty())
            throw new NoSuchElementException("Heap is empty.");
        T removeRootElement = heap.get(0);
        heap.remove(0);
        return removeRootElement;
    }
}
