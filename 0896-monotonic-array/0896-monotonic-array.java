class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                dec = false;
            }
        }
        for(int j = 0;j<nums.length-1;j++){
            if(nums[j]>nums[j+1]){
                inc = false;
            }
        }
        if(inc == true || dec== true){
            return true;
        }
        else{
            return false;
        }
        
    }
}