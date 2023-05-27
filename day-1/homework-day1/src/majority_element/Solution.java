package majority_element;

public class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count  = 1 ;
        int temp = nums[0];
        for(int i = 1 ; i<n; i++){
            if( nums[i] == temp){
                count++;
            }else{
                count--;
            }
            if(count  == 0){
                temp = nums[i];
                count = 1;
            }
        }
        return temp;
    }
}
// https://leetcode.com/problems/majority-element/submissions/958042404/