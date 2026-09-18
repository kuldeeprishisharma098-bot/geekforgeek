class Solution {
    public static boolean isPalinArray(int[] arr) {
        // code here.
        int p=arr.length;
        for(int i=0;i<p;i++){
           if(!palindrom(arr[i]))
           return false;
        }
        
        return true;
        
    }
    public static boolean palindrom(int n){
        int m=n;
        int sum=0;
        while(n>0){
        int digit=n%10;
        sum=(sum*10)+digit;
        n/=10;
        }
        return m==sum;
}
}