class Solution {
    public int uniquePaths(int m, int n) {
        int adim = m+n-2;
        int min = 0;
        double result = 1;
        if(m < n) min = m-1 ;
        else min = n-1 ; 
        for(int i= 1; i <= min ; i++ ){
            result *= adim;      
            result /= i;
            adim--;
        }
    return (int)result;
    }
}