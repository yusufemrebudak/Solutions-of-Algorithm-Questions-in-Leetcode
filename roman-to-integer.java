class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int i = 0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] ch = s.toCharArray();  
        int sum = 0;
        while( i<ch.length){    
            if (i == ch.length-1){
                sum+= map.get(ch[i]);
                i++;
            } 
            else if( map.get(ch[i]) >= map.get(ch[i+1]) ){
                sum+= map.get(ch[i]);
                i++;
            }else{
                sum+= map.get(ch[i+1]) - map.get(ch[i]) ;
                i+=2;
            } 
        }  
     return sum;  
    }
}