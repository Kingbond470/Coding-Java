/*
https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/
*/
class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstsum=0;
        int secondsum=0;
        int targetsum=0;
        String first="";
        String second="";
        String target="";
        for(int i=0; i<firstWord.length(); i++){
            char new_char=firstWord.charAt(i);
            first=first+changeCharValue(new_char);
        }
        
        for(int i=0; i<secondWord.length(); i++){
            char new_char=secondWord.charAt(i);
            second=second+changeCharValue(new_char);
        }
        
        for(int i=0; i<targetWord.length(); i++){
            char new_char=targetWord.charAt(i);
            target=target+changeCharValue(new_char);
        }
        firstsum=Integer.parseInt(first);
        secondsum=Integer.parseInt(second);
        targetsum=Integer.parseInt(target);
        if(firstsum+secondsum==targetsum) return true;
        else return false;
        
    }
    
    
    public static int changeCharValue(char ch){
        //it will give char from 0,1,2, to 25
        int value=(int)ch-97;
        return value;
    }
}


//0 ms Approach
class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstsum=0, secondsum=0, targetsum=0;
        
        for(char ch: firstWord.toCharArray()){
            firstsum=firstsum+ch-'a';
            firstsum=firstsum*10;
        }
        
        for(char ch:secondWord.toCharArray()){
            secondsum=secondsum+ch-'a';
            secondsum=secondsum*10;
        }
        
        for(char ch:targetWord.toCharArray()){
            targetsum=targetsum+ch-'a';
            targetsum=targetsum*10;
        }
        
        return (firstsum+secondsum)==targetsum;
        
    }
    
    
   
}
