class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int i = 1;
        int j = 0;
        int len = 1;
        int count = 1;

        while (i < nums.length) {

            if (nums[i] == nums[i - 1]) {
                len++;

                if (len <= 2) {
                    j++;
                    nums[j] = nums[i];
                    count++;
                }
            } else {
                len = 1;
                j++;
                nums[j] = nums[i];
                count++;
            }

            i++;
        }

        return count;
    }
}