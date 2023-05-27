package running_sum_of_1d_array;

public class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        for(int i =1 ; i < n ; i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
//  https://leetcode.com/problems/running-sum-of-1d-array/submissions/958041787/
