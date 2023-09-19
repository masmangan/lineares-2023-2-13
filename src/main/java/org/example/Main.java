package org.example;

class Node {
    int value;
    Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

class MyLinkedList {
    private Node first;

    public MyLinkedList() {
        this.first = null;
    }

    public void add(int value) {
        Node newNode = new Node(value, this.first);
        this.first = newNode;
    }

    public void append(int value) {
        if (first == null) {
            add(value);
        } else {
            Node newNode = new Node(value, null);
            Node n = this.first;
            while (n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }
    }

    public void insertAt(int value, int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == 0) {
            add(value);
        } else {
            if (i == size()) {
                append(value);
            } else {
                int p = 0;
                Node ant = this.first;
                while (p < i) {
                    p = p + 1;
                    ant = ant.next;
                }
                Node prox = ant.next;

                Node newNode = new Node(value, prox);
                ant.next = newNode;
            }
        }
    }

    public int size() {
        int s = 0;
        Node n = this.first;
        while (n != null) {
            s = s + 1;
            n = n.next;
        }
        return s;
    }

    public void print() {
        int i = 0;
        Node n = this.first;
        while (n != null) {
            System.out.printf("#%d %d %s %s %n", i, n.value, n, n.next);
            i = i + 1;
            n = n.next;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println(" Linked List ");

        MyLinkedList lst1 = new MyLinkedList();

        System.out.println(lst1.size());
        lst1.add(12);
        System.out.println(lst1.size());
        lst1.add(40);
        System.out.println(lst1.size());
        lst1.add(70);
        System.out.println(lst1.size());

        lst1.print();

        lst1.append(80);
        System.out.println(lst1.size());

        lst1.print();


    }
}
