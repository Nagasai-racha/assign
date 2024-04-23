package com.intern.java;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class CustomStack<T> {
    private List<T> stack;

    public CustomStack() {
        stack = new ArrayList<>();
    }

    // Push operation
    public void push(T item) {
        stack.add(item);
    }

    // Pop operation
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    // Peek operation
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>();

        // Pushing integers onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Popping and displaying integers until the stack is empty (LIFO behavior)
        System.out.println("Popping elements from the stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
