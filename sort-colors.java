class Solution {
    public void sortColors(int[] nums) {
        
        int i = 0 ;
        int j = 1 ;
        int min = 0;
        int hold = 0;
        if(nums.length == 0) return ;
        
        while(i < nums.length  ){
            if(j == nums.length ) {
                i++;
                j = i+1 ;
                continue;
            }
            if(nums[j] <  nums[i]){
                
                if(nums[j] == 0){
                    nums[j] = nums[hold];
                    nums[hold] = 0;
                    hold++;
                    i = hold;
                    j = i+1;
                } 
                else{
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i++;
                    j=i+1;
                }    
            }
            else j++; 
        }
    }
}