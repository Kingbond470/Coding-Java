/*
https://leetcode.com/problems/find-the-highest-altitude/
*/
class Solution {
    public int largestAltitude(int[] gain) {
      // start frm 0 so, -5+0, -5+1, -4+5, 1+0, 1+(-7) and return max value
        int initial=0;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(initial);
        int store_value=0;
       // int temp=0;
        for(int i=0; i<gain.length; i++){
            int value=store_value+gain[i]-initial;
            store_value=value;
            list.add(store_value);
        }
       int max=0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        return max;
    }
}
