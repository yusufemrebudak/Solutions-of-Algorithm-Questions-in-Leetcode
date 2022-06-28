class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();         
        char[] ch = new char[s.length()];
        int i = 0;
        int temp = 0;
        int sum = 0 ;
        for (; i < s.length(); i++) ch[i] = s.charAt(i);  
        i = 0;
        if(s.isEmpty()) return 0 ;
        while(i < s.length()){
            if(myMap.containsKey(ch[i])) {
                temp = 1;
                i = myMap.get(ch[i]) + 1 ;
                myMap.clear();
                myMap.put(ch[i],i); 
            }
            else{
                 myMap.put(ch[i],i); 
                 temp++;
            }
            if(temp > sum) sum = temp;
            i++;
        }
        
        
    return sum;    
    }
}