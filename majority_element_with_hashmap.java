class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        
        for(int i = 0; i<nums.length; i++){
            if(myMap.containsKey(nums[i]) != true){
                myMap.put(nums[i],1);
            }else{
                myMap.put(nums[i], myMap.get(nums[i]) + 1 );   
            }
            if(myMap.get(nums[i]) > nums.length/2 ) return nums[i];
        }
    return -1;    
    }
}