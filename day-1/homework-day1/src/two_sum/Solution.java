package two_sum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] kq = new int[2];
        int leng = nums.length;
        for(int i = 0; i<leng;i++){
            for(int j = 0;j<leng;j++){
                if(i == j){
                    continue;
                }
                if(nums[i]+nums[j] == target){
                    kq[0] = i;
                    kq[1] = j;
                }
            }
        }
        return kq;
    }
}
// https://leetcode.com/problems/two-sum/submissions/958040688/
