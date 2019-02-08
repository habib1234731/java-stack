package com.lambdaschool;

public class GenericsStack <E extends Object> {
    private final int size;
    private E[] stack;
    private int top;

    public GenericsStack(int size) {
        this.size = size;
        this.stack = (E[]) new Object[size];
        this.top = -1;
    }

    public String getTop() {
        if (top == -1) return "There are no items in your stack";
        return Integer.toString(top + 1);
    }

    public void push (E element) {
        if (top == (size - 1)) throw new UnsupportedOperationException("Stack limit reached");
        this.stack[++top] = element;
    }

    public E pop () {
        if (top == -1) throw new UnsupportedOperationException("Stack is empty");
        E element = this.stack[top--];
        return element;
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
