package data_structure.linear.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_Using_Two_Queues {
    public static void main(String[] args) {

    }

    public static class Solution {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        String[] arr = {""};
        

        public void push(int x) {
            // ToDo: Write Your Code Here.
            queue1.add(x);
        }

        public int pop() {
            // ToDo: Write Your Code Here.
            int value = -1;
            if (!queue1.isEmpty()) {
                while (queue1.size() != 1) {
                    queue2.add(queue1.poll());
                }
                value = queue1.poll();
                while (!queue2.isEmpty()) {
                    queue1.add(queue2.poll());
                }
            }
            return value;
        }
    }
}
