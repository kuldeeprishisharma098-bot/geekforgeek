class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        int sum=0;
        for(int num:arr){
            sum=sum^num;
        }
        return sum;
    }
}