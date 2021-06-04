/*
https://leetcode.com/problems/split-a-string-in-balanced-strings/

 class Solution {
    public int balancedStringSplit(String s) {
        //i find use substring and count the number of r and l in each substring if they are equal then count increase otherwise not
        int count=0;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                System.out.print(s.substring(i,j+1)+" ");
                String new_str=s.substring(i,j+1);
                int l_count=1;
                int r_count=1;
                for(int k=0; k<=new_str.length()-2; k++){
                    if(new_str.charAt(k)=='L' && new_str.charAt(k+1)=='L'){
                        l_count++;
                        k++;
                    }
                    else if(new_str.charAt(k)=='R' && new_str.charAt(k+1)=='R'){
                        r_count++;
                        k++;
                    }   
                    else{
                        r_count=1;
                        l_count=1;
                    }
                }
                 if(l_count==r_count && l_count>2 && r_count>2){
                   // System.out.println(count);
                    count++;
                }
               
            }
           // System.out.println();
        }
        return count;
    }
}
*/

//Solution
class Solution {
    public int balancedStringSplit(String s) {
        int lcount=0, rcount=0, count=0;
       for(int i=0; i<s.length(); i++){
           if(s.charAt(i)=='L') lcount++;
           else if(s.charAt(i)=='R') rcount++;
           
           if(lcount==rcount) count++;
       }
        return count;
    }
}
