/*
https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
*/
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        int remainder=0;
        while(n!=0){
            remainder=n%10;
            sum=sum+remainder;
            product=product*remainder;
            n=n/10;
        }
        int result=product-sum;
        return result;
    }
}
