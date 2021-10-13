class Solution {
    public int maxProduct(int[] nums) {
        
        int max_product=0, product=0;
        
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                product=(nums[i]-1) * (nums[j]-1);
                    if(product>max_product) max_product=product;
            }
        }
        return max_product;
    }
}
// 6 8 2
// 12 4
// 4
//which is 4 5
// 0 0 0 0 
// 0 12 16
// 12
//which is 5 5
// 2 6 12

//Method -2
class Solution {
    public int maxProduct(int[] nums) {
        int maximum_value1=Integer.MIN_VALUE, maximum_value2=maximum_value1;
        for(int i=0; i<nums.length; i++){
            if( nums[i]>maximum_value1){
                maximum_value2=maximum_value1;
                maximum_value1=nums[i];
               // System.out.println(maximum_value1+ " "+ maximum_value2);
            }
            else if( nums[i]>maximum_value2){
                maximum_value2=nums[i];
            }
        }
        int result=(maximum_value1-1)*(maximum_value2-1);
        return result;
    }
}

//Iterate array
//if current value is more than maximum_value1, put current value in maximum value1 and maximum value 1 in maximum value 2
//else if current value is more than maximum Value 2, put current value in maximum value 2


// Using Sorting
class Solution {
    public int maxProduct(int[] nums) {
        
       Arrays.sort(nums);
        int maximum_value1=nums[nums.length-1];
        int maximum_value2=nums[nums.length-2];
        int result=(maximum_value1-1)*(maximum_value2-1);
        return result;
    }
}

