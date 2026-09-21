class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i =0;i<nums.length;i++){
            int indexval  = Math.abs(nums[i]);
            nums[indexval-1] = - Math.abs(nums[indexval-1]);
           
            
        } List<Integer> ans =  new ArrayList<>();
         for(int j=0;j<nums.length;j++){
                if(nums[j]>0){
                    ans.add(j+1);
                }
            }
        return ans;
    }
}