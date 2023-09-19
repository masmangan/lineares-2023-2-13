package org.example;

public class QueueApp {
    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
        System.out.println(" Queue! ");

        Queue q1 = new Queue();
        System.out.println(q1);
        q1.enqueue(10);
        System.out.println(q1);
        q1.enqueue(20);
        System.out.println(q1);
        q1.enqueue(30);
        System.out.println(q1);
        System.out.println(q1.dequeue());
        System.out.println(q1);
        q1.enqueue(40);
        System.out.println(q1);
        q1.enqueue(50);
        System.out.println(q1);

        System.out.println(q1.dequeue());
        System.out.println(q1);
        System.out.println(q1.dequeue());
        System.out.println(q1);
        System.out.println(q1.dequeue());
        System.out.println(q1);

    }
}
