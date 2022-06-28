class Solution {
    public String longestPalindrome(String s) {
        //Stack<Character> stack1 = new Stack<Character>();
        //Stack<Character> stack2 = new Stack<Character>();
        int j = s.length() - 1  ;
        int max=0;
        String tempString = "";
        String result = "";
        if(s.length() == 1 ){
            result += s.charAt(0);
            return result;
        }
        for(int i = 0; i<s.length();i++){  
            char c1 = s.charAt(i); 
            char c2 = s.charAt(j);
            if(c1 == c2) tempString += c1; // or tempString += c2;
            else tempString = "";     
            
            if(tempString.length() > max) {
                max = tempString.length();
                result = tempString;
            }
        j--;    
        }   
        
    return result;   
    }
}