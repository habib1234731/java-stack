package com.lambdaschool;

public class Stack {
    private final int size;
    private String[] stack;
    private int top;

    public Stack(int size) {
        this.size = size;
        stack = new String[size];
        this.top = -1;
    }
}
