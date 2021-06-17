//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String word1_str="", word2_str="";
        for(int i=0; i<word1.length; i++){
            word1_str=word1_str+word1[i];
        }
        for(int i=0; i<word2.length; i++){
            word2_str=word2_str+word2[i];
        }
        return word1_str.equals(word2_str);
    }
}


//using function
class Solution {
    public static String getString(String[] word){
        String word_str="";
        for(int i=0; i<word.length; i++){
            word_str=word_str+word[i];
        }
        return word_str;
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {        
        return getString(word1).equals(getString(word2));
    }
    
}

//0ms using stringBuilder
class Solution {
    
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {        
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        
        for(String word: word1) sb1.append(word);
        for(String word: word2) sb2.append(word);
        
        String s1=sb1.toString();
        String s2=sb2.toString();
        return s1.equals(s2);
    }
    
}


//using join
class Solution {
    
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {  
        String s2="", s3="";
        String s1=s2.join("", word1);
        String s4=s3.join("", word2);
        return s1.equals(s4);
        // return s1.join("",word1).equals(s2.join("",word2));
        
    }
    
}
