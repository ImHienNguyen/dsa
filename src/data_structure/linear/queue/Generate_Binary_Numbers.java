package data_structure.linear.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Generate_Binary_Numbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.generateBinaryNumbers(4)));
    }

    public static class Solution {
        // Solution 1
        // public static String[] generateBinaryNumbers(int n) {
        //     String[] res = new String[n]; //You can modify this

        //     for (int i = 0; i<n; i++) {
        //         res[i] = Integer.toBinaryString(i+1);
        //     }
        //     // ToDo: Write Your Code Here.
        //     return res;
        // }

        // Solution 2
        public static String[] generateBinaryNumbers(int n) {
            String[] res = new String[n]; //You can modify this
            Queue<String> myQueue = new LinkedList<>();
            myQueue.add("1");

            for (int i = 0; i < n; i++) {
                res[i] = myQueue.poll();
                myQueue.add(res[i] + "0");
                myQueue.add(res[i] + "1");
            }
            // ToDo: Write Your Code Here.
            return res;
        }
    }
}
