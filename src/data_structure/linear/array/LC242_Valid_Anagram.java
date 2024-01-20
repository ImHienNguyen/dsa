package data_structure.linear.array;

public class LC242_Valid_Anagram {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("rat", "car"));
    }

    public static class Solution {
        public boolean isAnagram(String s, String t) {
            int[] scanner = new int[26];
            for (char c : s.toCharArray()) {
                scanner[c - 'a']++;
            }

            for (char c : t.toCharArray()) {
                scanner[c - 'a']--;
            }

            for (int n : scanner) {
                if (n != 0) return false;
            }

            return true;
        }
    }
}
