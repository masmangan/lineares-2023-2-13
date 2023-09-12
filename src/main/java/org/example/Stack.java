package org.example;

import java.util.Arrays;

class Stack {
    private int[] data;
    private int top;

    public Stack() {
        data = new int[5];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public void push(int value) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException();
        }
        top = top + 1;
        data[top] = value;
    }

    public int pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        int value = data[top];
        top = top - 1;
        return value;
    }

    public int peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        return data[top];
    }

    @Override
    public String toString() {
        return "Stack{" +
                "data=" + Arrays.toString(data) +
                ", top=" + top +
                '}';
    }
}
