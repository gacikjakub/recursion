package codingBat.recursion2;

public class Exe7SplitOdd10 {

/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple of 10,
and the sum of the other group is odd. Every int must be in one group or the other. Write a recursive helper method
that takes whatever arguments you like, and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)


splitOdd10([5, 5, 5]) → true
splitOdd10([5, 5, 6]) → false
splitOdd10([5, 5, 6, 1]) → true

 */

    public boolean splitOdd10(int[] nums) {
        return helper(0,nums,0,0);
    }


    private boolean helper(int start, int[] nums, int mult10, int odd) {
        if (start>= nums.length) return (mult10%10==0 && odd%2==1);
        return helper(start+1,nums, mult10+nums[start], odd) ||
                helper(start+1,nums, mult10, odd+nums[start]);
    }

}
