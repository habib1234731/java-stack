package com.lambdaschool;

public class Stack {
    private final int size;
    private String[] stack;
    private int top;

    public Stack (int size) {
        this.size = size;
        stack = new String[size];
        top = -1;
    }

    // returns the number of elements in the stack
    public String getTop() {
        if (top == -1) return "There are no items in your stack";
        return Integer.toString(top + 1);
    }

    public void push (String str) {
        if (stack.length > size) throw new UnsupportedOperationException("Stack limit reached");
        stack[++top] = str;
    }

    public String pop () {
        if (top == -1) throw new UnsupportedOperationException("Stack is empty");
        return stack[top--];
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i <= top; i++) {
            if(stack[i] == null) break;
            System.out.print("'" + stack[i] + "', ");
        }
        System.out.print("]\n");
    }
}
