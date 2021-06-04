/*
https://leetcode.com/problems/count-items-matching-a-rule/
*/
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        //i will see the type, color and name if any matches then check corresponding value, if found  then increase the count and return it
        int count=0;
        for(int i=0; i<items.size(); i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)){
                count=count+1;
            }
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)){
                count=count+1;
            }
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)){
                count=count+1;
            }
        }
        return count;
    }
}

/*
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        //i will see the type, color and name if any matches then check corresponding value, if found  then increase the count and return it
        int count=0;
        int k=0;
        if(ruleKey.equals("color")){
            k=1;
        }
        else if(ruleKey.equals("name")){
            k=2;
        }
        for(List b: items){
            if(b.get(k).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
*/
