package codingBat.recursion1;

public class Exe17Array220 {

/*
Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10.
We'll use the convention of considering only the part of the array that begins at the given index.
In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.


array220([1, 2, 20], 0) → true
array220([3, 30], 0) → true
array220([3], 0) → false

 */

    public boolean array220(int[] nums, int index) {
        if (nums.length <2 || index >= nums.length) return false;
        return subArray220(nums,index, index+1) ? true : array220(nums, index+1);
    }

    private boolean subArray220(int[] nums, int start, int index) {
        if (nums.length <2 || index >= nums.length) return false;
        return nums[start]*10==nums[index]? true : subArray220(nums, start, index+1);
    }

}
