package assingment2;

public class Assignment2 {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        System.out.println("Checking push() method:\n");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("1-5 elements pushed.");

        System.out.println("Checking pop() method: " +stack.pop());
        System.out.println("Checking peek() method: " + stack.peek());
        System.out.println("Checking isEmpty() method: " +stack.isEmpty());
        System.out.println("Checking size() method: " + stack.size());
        System.out.println("Checking toString() method:\n" + stack);

        MyQueue<Integer> queue = new MyQueue<>();

        System.out.println("Checking enqueue() method:\n");
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        System.out.println("6-10 elements inserted.");

        System.out.println("Checking dequeue() method: " +queue.dequeue());
        System.out.println("Checking peek() method: " + queue.peek());
        System.out.println("Checking isEmpty() method: " +queue.isEmpty());
        System.out.println("Checking size() method: " + queue.size());

        MyHeap<Integer> heap = new MyHeap<>(20);

        heap.add(1);
        heap.add(4);
        heap.add(2);
        heap.add(5);
        heap.add(13);
        heap.add(17);
        heap.printHeap();

        System.out.println("Root max: " + heap.removeRoot());

        heap.printHeap();

    }
}
