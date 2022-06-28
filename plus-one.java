class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1 ;
        
        for(; i>=0; i--){
                if(digits[i] == 9) digits[i] = 0;
                else{
                    digits[i] = digits[i] + 1;
                    break;
                } 
        } 
        if(i >= 0) return digits;
        int[] newNumber = new int[digits.length + 1];
        int j = 0;
        for(j = digits.length; j>0; j--){
            newNumber[j] = 0;      
        }
        newNumber[0] = 1;
        
        return newNumber;
    }
}