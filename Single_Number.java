class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int temp;
        int i = 0;
        for(; i<nums.length; i++){
            if (map.containsKey(nums[i])!= true)  map.put(nums[i],1);
            else map.put(nums[i],2);   
        }
        for(i = 0 ; i<nums.length; i++){
           if(map.get(nums[i])== 1) return nums[i];
        }
    return -1;    
    }
}