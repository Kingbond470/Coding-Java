/*
https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/
*/
class Solution {
    
    public static boolean checkZeroOnes(String s) {
        boolean value=false;
        // 1 true and other wise false
        int one_max=0;
        int one_count=0;
        int zero_max=0;
        int zero_count=0;
        if(s.length()==1){
            if(s.charAt(0)=='1'){
                one_max=1;
            }
            else{
                zero_max=1;
            }
        }

        for(int i=0; i<s.length()-1; i++){

            if(s.charAt(i)=='1'){
                if(s.charAt(i)==s.charAt(i+1)){
                    one_count++;
                   // System.out.println(one_count+" one count");
                }
                else{
                    one_count=0;
                }
            }
            else{
                if(s.charAt(i)==s.charAt(i+1)){
                    zero_count++;
                  //  System.out.println(zero_count+" zero count");
                }
                else{
                    zero_count=0;
                }
            }

            if(one_count>one_max){
                one_max=one_count;
            }

            if(zero_count>zero_max){
                zero_max=zero_count;
            }
        }
        if(one_max>zero_max){
            value=true;
        }
        return value;

    }
}
