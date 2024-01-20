package data_structure.linear.array;

import java.util.HashSet;

public class LC217_Contains_Duplicate {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(solution.containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    private static class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> mySet = new HashSet<>();
            for (int n : nums) {
                if (mySet.contains(n)) return true;
                mySet.add(n);
            }
            return false;
        }
    }
}