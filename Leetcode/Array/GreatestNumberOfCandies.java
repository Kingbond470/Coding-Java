/*
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
*/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest=candies[0];
        int[] new_candies=new int[candies.length];
        List<Boolean> value=new ArrayList<Boolean>();
        for(int i=0; i<candies.length; i++){
            if(candies[i]>greatest){
                greatest=candies[i];
            }
            new_candies[i]=candies[i]+extraCandies;
        }
        
        for(int i=0; i<new_candies.length; i++){
            if(new_candies[i]>=greatest){
                value.add(true);
            }
            else{
                value.add(false);
            }
        }
        
        // for(String values :value){
        //     System.out.print(values+" ");
        // }
    
        
      return value;  
    }
}
// if I add extra candies and it greater than equal to greatest element in array than true otherwise false
