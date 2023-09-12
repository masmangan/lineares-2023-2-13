package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void testNewStackIsEmpty() {
        Stack s = new Stack();
        assertTrue(s.isEmpty());
    }

    @Test
    public void testReverseOrder() throws StackUnderflowException, StackOverflowException {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        assertEquals(30, s.pop());
        assertEquals(20, s.pop());
        assertEquals(10, s.pop());
    }

    @Test
    void testThrowsException() {
        Stack s = new Stack();

        assertThrows(StackUnderflowException.class, () -> {
            s.push(10);
        });
    }
}
