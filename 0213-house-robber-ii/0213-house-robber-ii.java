class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1){
            return nums[0];
        }

        if(n == 2){
            return Math.max(nums[0] , nums[1]);
        }
        
        int prev2 = nums[0];
        int prev1 = Math.max(nums[0] , nums[1]);

        for(int i = 2; i<nums.length-1; i++){
            int curr = Math.max(prev2 + nums[i] , prev1);
            prev2 = prev1;
            prev1 = curr;
        }

        int last2 = nums[1];
        int last1 = Math.max(nums[1] , nums[2]);

        for(int i = 3; i<nums.length; i++){
            int curr = Math.max(last2 + nums[i] , last1);
            last2 = last1;
            last1 = curr;
        }

        return Math.max(prev1 , last1);
    }
}