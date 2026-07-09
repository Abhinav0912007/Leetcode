import java.util.HashSet;

class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // Store all numbers in the HashSet
        for (int num : nums) {
            set.add(num);
        }

        // Check which number from 0 to n is missing
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1; // This line will never be reached
    }
}