package data_structure.linear.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAQueue {
    public static void main(String[] args) {
        ReverseAQueue solution = new ReverseAQueue();
        Queue<Integer> testcase1 = new LinkedList<>();
        testcase1.add(7);
        testcase1.add(8);
        testcase1.add(9);
        testcase1.add(10);
        testcase1.add(11);
        System.out.println(solution.reverseQueue(testcase1));
    }

    public Queue<Integer> reverseQueue(Queue<Integer> q) {
        // ToDo: Write Your Code Here.
        Stack<Integer> tmp = new Stack<>();

        while (!q.isEmpty()) {
            tmp.add(q.remove());
        }

        while (!tmp.isEmpty()) {
            q.add(tmp.pop());
        }
        return q;
    }
}
