class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        int[] maps=new int[256];
        int[] mapt=new int[256];
        
        int length=s1.length();
        for(int i=0;i<length;i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(maps[ch1]!=mapt[ch2]){
                return false;
            }
            maps[ch1]=i+1;
            mapt[ch2]=i+1;
        }
        return true;
    }
}