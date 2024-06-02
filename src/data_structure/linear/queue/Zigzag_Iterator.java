package data_structure.linear.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Zigzag_Iterator {
    public static void main(String[] args) {
        List<Integer> v1 = Arrays.asList(1, 2);
        List<Integer> v2 = Arrays.asList(3, 4, 5, 6);
        Solution solution = new Solution(v1, v2);
        System.out.println(solution.next()); // 1
        System.out.println(solution.next()); // 3
        System.out.println(solution.next()); // 2
        System.out.println(solution.next()); // 4
        System.out.println(solution.next()); // 5
        System.out.println(solution.next()); // 6
        System.out.println(solution.hasNext()); // false
    }

    public static class Solution {
        Queue<Integer> zigzagQueue = new LinkedList<>();

        public Solution(List<Integer> v1, List<Integer> v2) {
            // ToDo: Write Your Code Here.
            int length = Math.max(v1.size(), v2.size());
            for (int i = 0; i < length; i++) {
                if (v1.size() > i) {
                    zigzagQueue.add(v1.get(i));
                }
                if (v2.size() > i) {
                    zigzagQueue.add(v2.get(i));
                }
            }
        }

        public int next() {
            // ToDo: Write Your Code Here.
            return hasNext() ? zigzagQueue.poll() : -1;
        }

        public boolean hasNext() {
            // ToDo: Write Your Code Here.
            return !zigzagQueue.isEmpty();
        }
    }
}
