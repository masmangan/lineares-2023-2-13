package org.example;

public class Main {
    public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
        System.out.println("Stack!");
        Stack s1 = new Stack();

        System.out.println(s1);
        s1.push(10);
        System.out.println(s1);
        s1.push(20);
        System.out.println(s1);
        s1.push(30);
        System.out.println(s1);
        s1.push(40);
        System.out.println(s1);
        s1.push(50);
        System.out.println(s1);
        s1.pop();
        s1.push(60);
        System.out.println(s1);

        while (!s1.isEmpty()) {
            System.out.println(s1.pop());
            System.out.println(s1);
        }
        System.out.println(s1);
    }
}