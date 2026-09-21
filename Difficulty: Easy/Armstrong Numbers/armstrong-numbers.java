class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int m=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+(digit*digit*digit);
            n/=10;
        }
        if(m==sum){
            return true;
        }
        return false;
        
    }
}