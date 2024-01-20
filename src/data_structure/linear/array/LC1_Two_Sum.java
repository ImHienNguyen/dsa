package data_structure.linear.array;

import java.util.Arrays;
import java.util.HashMap;

public class LC1_Two_Sum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 3}, 6)));
    }

    public static class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> myMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int tmp = target - nums[i];
                if (myMap.containsKey(tmp)) return new int[]{myMap.get(tmp), i};
                myMap.put(nums[i], i);
            }
            return null;
        }
    }
}
