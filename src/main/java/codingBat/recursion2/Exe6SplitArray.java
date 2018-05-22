package codingBat.recursion2;

public class Exe6SplitArray {

/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same.
Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like,
and make the initial call to your recursive helper from splitArray(). (No loops needed.)


splitArray([2, 2]) → true
splitArray([2, 3]) → false
splitArray([5, 2, 3]) → true

 */

    public boolean splitArray(int[] nums) {
        return helper(0,nums,0,0);
    }


    private boolean helper(int start, int[] nums, int g1, int g2) {
        if (start >= nums.length) return (g1==g2);
        return helper(start+1,nums, g1+nums[start], g2) ||
                helper(start+1,nums, g1, g2+nums[start]);
    }

}
