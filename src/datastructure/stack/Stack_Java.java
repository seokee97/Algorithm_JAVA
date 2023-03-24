package datastructure.stack;

import java.util.Stack;

public class Stack_Java {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Peek : "+stack.peek());

        System.out.println("Pop : "+stack.pop());
        System.out.println("Pop : "+stack.pop());
        System.out.println("Pop : "+stack.pop());
        System.out.println("Pop : "+stack.pop());
        System.out.println("Pop : "+stack.pop());


    }
}
