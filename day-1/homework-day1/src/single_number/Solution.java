package single_number;

import java.util.Arrays;

public class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        for(int i = 1 ; i < n -1 ; i ++){
            if(nums[i] != nums[i+1] && nums[i] != nums[i-1]){
                return nums[i];
            }
        }
        return 1;
    }
}
// https://leetcode.com/problems/single-number/submissions/958041090/
