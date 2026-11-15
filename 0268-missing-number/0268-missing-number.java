class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actual_sum = n * (n+1) / 2;
        int total_sum = 0;

        for(int i = 0; i<nums.length; i++){
            total_sum += nums[i];
        }

        return actual_sum - total_sum;
    }
}