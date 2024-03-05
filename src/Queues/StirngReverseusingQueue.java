package Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class StirngReverseusingQueue {

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack= new Stack<Integer>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue= new ArrayDeque<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println("original queue "+queue);

        reverse(queue);
        System.out.println("reversed queue "+ queue);
    }
}
