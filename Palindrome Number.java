class Solution {
    public boolean isPalindrome(int x) {
        int duplicate =x,sum=0;
        if(x<0) return false ;
        while(x!=0){
            int ld=x%10;
            sum=sum*10+ld;
            x /=10;
        }
        return duplicate==sum;
    }
}
