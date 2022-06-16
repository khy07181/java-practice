package com.example.javapractice.effectivejava.item07.stack;

import java.util.Arrays;

public class Stack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    // 계속해서 elements가 쌓이기만 해서 언젠가는 메모리 누수가 발생한다.
//    public Object pop() {
//        if (size == 0)
//            throw new EmptyStackException();
//        return elements[--size];
//    }

    // pop한 뒤에 객체 참조를 해제
    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null; // 다 쓴 참조 해제
        return result;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (String arg : args) {
            stack.push(arg);
        }

        while (true) {
            System.err.println(stack.pop());
        }

    }
}