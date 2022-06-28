class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] != 0 && nums[j] == 0 ){
                int temp = nums[i];
                nums[j++] = temp;
                nums[i] = 0;
            }
            if(nums[j] != 0) j++;  
        }  
        
    }
}