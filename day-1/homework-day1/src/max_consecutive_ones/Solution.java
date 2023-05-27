package max_consecutive_ones;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        for(int i = 1 ; i < n; i++){
            if(nums[i] == 1 && nums[i-1] > 0){
                nums[i]+=nums[i-1];
            }
        }
        int max = nums[0];

        for(int i = 1;i<n ;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
}
// https://leetcode.com/problems/max-consecutive-ones/submissions/958042147/