class Solution {
    public int jump(int[] nums) {
        int j = 1;
        int max = 0 ;
        int result =  0;
        int temp = 0;
        if(nums.length == 1 ) return 0 ;
        for(int i = 0; i < nums.length;){
            if(j == nums.length -1 ) return result+1 ;
            
            if(  j + nums[j]  >= max) {
                max = j + nums[j];
                temp = j;
            }
            
            if(nums[i] + i  == j ){
                 max = 0;
                 i = temp ;
                 j = i+1;
                 result++;
                 
            } 
            else j++; 
           
        }
        
    return result;
    }
}