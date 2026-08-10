class Solution {
    public int maxSubArray(int[] nums) {
      int  i = 0;
      int bestend = nums[i];
      int ans = nums[i];
      for(i  = 1;i<nums.length;i++){
        int v1 = bestend + nums[i];
        int v2 = nums[i];
        bestend = Math.max(v1,v2);
        ans  = Math.max(ans,bestend);
      }
      return ans;
    }
}
