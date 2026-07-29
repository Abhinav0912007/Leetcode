class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int low = 0;
        int high = 1;

        while (high < nums.length) {

            if (nums[low] != nums[high]) {
                low++;
                nums[low] = nums[high];
            }

            high++;
        }

        return low + 1;
    }
}