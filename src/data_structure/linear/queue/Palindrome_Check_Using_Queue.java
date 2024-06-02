package data_structure.linear.queue;

import java.util.Deque;
import java.util.LinkedList;

public class Palindrome_Check_Using_Queue {
    public static void main(String[] args) {
        System.out.println(Solution.checkPalindrome("hello"));
    }

    public static class Solution {
        public static boolean checkPalindrome(String s) {
            // ToDo: Write Your Code Here.
            s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            Deque<Character> myQueue = new LinkedList<>();
            for (char c : s.toCharArray()) {
                myQueue.add(c);
            }

            while (!myQueue.isEmpty()) {
                if (myQueue.size() == 1) return true;
                if (myQueue.pollFirst() != myQueue.pollLast()) {
                    return false;
                }
            }
            return true;
        }
    }
}
