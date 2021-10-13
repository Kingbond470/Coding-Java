//Brute Force Approach
public class Main {
    public static void main(String args[]) {
       int[] arr={7,1,5,3,6,4};
        int profit=0;
        int  max_profit=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
            profit=arr[j]-arr[i];
            if(profit>max_profit) max_profit=profit;
            }

        }
        System.out.println(max_profit);
    }
}

//Method -2
class Solution {
   public int maxProfit(int[] prices) {
        int max = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
            else if (prices[i] > min) max = Math.max(prices[i] - min, max);
        }
        return max;
    }
}

//Method -3
class Solution {
    public int maxProfit(int[] prices) {
        int profit=0, max_profit=0, min_price=prices[0];
        for(int i=1;i<prices.length; i++){
            profit=prices[i]-min_price;
            min_price=Math.min(min_price,prices[i]);
            max_profit=Math.max(max_profit,profit);
        }
        return max_profit;
    }
}
