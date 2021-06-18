class Solution {
    public String replaceDigits(String s) {
        String result="";
        for(int i=0; i<s.length()-1; i++){
            char c=s.charAt(i);
            int x=(int)s.charAt(i+1);
            result=result+shift(c,x);
        }
        return result;
    }
    public static char shift(char c, int x){
        int value=(int)c+x;
        if(value>122){
            while(value>122){
                value=value%122;
            }
        }
        return (char)value;
    }
}
