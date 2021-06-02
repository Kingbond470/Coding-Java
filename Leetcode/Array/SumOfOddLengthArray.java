/*
https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
*/
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=0; i<arr.length; i++){
            int temp_sum=0;
            for(int j=i; j<arr.length; j++){
                if((i+j)%2==0){
                    for(int k=i; k<=j; k++){
                        temp_sum=temp_sum+arr[k];
                    }
                }
               
            }
             sum=sum+temp_sum;
            
        }
        
        return sum;
    }
}

//Optimize apporach

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        int n=arr.length;
        for(int i=0; i<n; i++){
            sum=sum+((i+1)*(n-i)+1)/2*arr[i];
        }
        
        return sum;
    }
}
