package Stacks;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();

        System.out.println("Empty stack : "+stack);

        // add values to the stack
        stack.push("java");
        stack.push("python");
        stack.push("go");
        stack.push("dart");
        stack.push("js");
        stack.push("kotlin");

        System.out.println("stack after push values : "+stack);

        //remove from the stack

        stack.pop(); // this removes the topmost element from the stack
        System.out.println(stack);

        stack.pop();
        System.out.println(stack.size());// shows the no of elements in the stack

        System.out.println(stack.peek()); // shows the top most element which is going to be removed from the stack



    }
}
