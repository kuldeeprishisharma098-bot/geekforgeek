class Solution {
    public boolean reachesOne(int n) {
        // code here
        Set<Integer> seen=new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n=getnext(n);
        }
        return n==1;
    }
    public int getnext(int n){
        int totalsum=0;
        while(n>0){
            int digit =n%10;
            totalsum+=digit*digit;
            n/=10;
        }
        return totalsum;
    }
}