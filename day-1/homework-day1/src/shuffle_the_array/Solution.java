package shuffle_the_array;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a = new int[2*n];
        int j = 0;
        for(int i = 0; i <2*n; i+=2){
            a[i] = nums[j];
            a[i+1] = nums[j+n];
            j++;
        }
        return a;
    }
}
// https://leetcode.com/problems/shuffle-the-array/submissions/958042716/