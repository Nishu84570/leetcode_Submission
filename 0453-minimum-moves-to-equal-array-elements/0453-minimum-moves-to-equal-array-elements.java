class Solution {
    public int minMoves(int[] nums) {
        int mini = Integer.MAX_VALUE;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] < mini){
                mini = nums[i];
            }
        }

        int min_move = 0;

        for(int i = 0; i<nums.length; i++){
            min_move += nums[i] - mini;
        }

        return min_move;
    }
}