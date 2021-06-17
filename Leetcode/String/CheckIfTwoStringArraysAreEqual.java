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
