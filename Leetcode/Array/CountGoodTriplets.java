/*
https://leetcode.com/problems/count-good-triplets/
*/
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(Math.abs(arr[i]-arr[j]) <=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}


//Another Approach

class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int i = 0;
        int j = i + 1,
            k = j + 1;
        
        while(i < arr.length && j < arr.length && k < arr.length){
            if(Math.abs(arr[i] - arr[j]) <= a &&
               Math.abs(arr[j] - arr[k]) <= b &&
               Math.abs(arr[i] - arr[k]) <= c){
                cnt++;
            }
            if(k < arr.length){
                k++;
            }
            if(k == arr.length){
                j++;
                k = j + 1;
            }
            if(j+1 == arr.length){
                i++;
                j = i + 1;
                k = j + 1;
            }
        }
        return count;
    }
}
