class Solution {
       public boolean increasingTriplet(int[] nums) {
        // start with two largest values, as soon as we find a number bigger than both, while both have been updated, return true.
        int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= small) { small = n; } // update small if n is smaller than both
            else if (n <= big) { big = n; } // update big only if greater than small but smaller than big
            else return true; // return if you find a number bigger than both
        }
        return false;
    }


}
// 1 2 3 4 5
// i=0 1 2 3    ==>  1<2<3 and i<J<k
// i=1 2 3 4    ==>  2<3<4 and i<j<k
// i=2 3 4 5    ==> 3<4<5 and i<j<k
// count=3;
//iterate the array and start from 0 to length-2

//[20,100,10,12,5,13]
