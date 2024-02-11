package data_structure.linear.array;

public class LC1523_Count_Odd_Numbers_In_An_Interval_Range {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countOdds(3, 7));
        System.out.println(solution.countOdds(8, 10));
    }

    public static class Solution {
        public int countOdds(int low, int high) {
            int range = high - low + 1;
            return low % 2 == 0 && high % 2 == 0 ? (range - 1) / 2 : range - range / 2;
        }
    }
}
