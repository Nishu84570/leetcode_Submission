class Solution {
    public int minMoves(int[] nums) {
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] > maxi){
                maxi = nums[i];
            }
        }

        int min_move = 0;

        for(int i = 0; i<nums.length; i++){
            min_move += maxi - nums[i];
        }

        return min_move;
    }
}