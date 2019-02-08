package com.lambdaschool;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(1000);
        System.out.println(stack.getTop());
//        System.out.println(stack.pop());
        stack.push("first");
//        stack.print();
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        stack.push("second");
        stack.push("third");
        System.out.println(stack.getTop());
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        System.out.println(stack.getTop());
    }
}
