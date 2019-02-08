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

        System.out.println();
        System.out.println("*****Generics Stack*****");
        System.out.println();

        GenericsStack<String> stringStack = new GenericsStack<>(1000);
        System.out.println(stringStack.getTop());
        stringStack.push("first");
        stringStack.push("second");
        stringStack.push("third");
        System.out.println(stringStack.getTop());
        stringStack.print();
        stringStack.pop();
        stringStack.print();
        stringStack.pop();
        stringStack.print();
        stringStack.pop();
        stringStack.print();
        System.out.println(stringStack.getTop());
    }
}
