/*
https://leetcode.com/problems/to-lower-case/
*/
class Solution {
    public String toLowerCase(String s) {
        String str="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){ 
                char c=(char)(s.charAt(i)+32);
                str=str+c;
            }
            else str=str+s.charAt(i);
        }
        return str;
    }
}
