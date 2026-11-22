class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min_len = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for(int i = 0; i<nums.length; i++){
            sum += nums[i];

            while(sum >= target){
                min_len = Math.min(min_len , i - start + 1);
                sum = sum -  nums[start];
                start++;
            }
        }

        if(min_len == Integer.MAX_VALUE){
            return 0;
        }

        return min_len;
    }
}