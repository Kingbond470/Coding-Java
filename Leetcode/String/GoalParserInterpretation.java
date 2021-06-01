/*
https://leetcode.com/problems/goal-parser-interpretation/
*/
class Solution {
    public String interpret(String command) {
        String result="";
        for(int i=0; i<command.length(); i++){
            if(command.charAt(i)=='G'){
                result=result+"G";
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                result=result+"o";
                i++;
            }
            else {
                result=result+"al";
                i+=3;
            }
        }
        return result;
    }
}
