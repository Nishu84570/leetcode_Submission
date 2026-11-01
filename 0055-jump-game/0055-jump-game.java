class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int max_reach = 0;

        for(int i = 0; i<nums.length; i++){
            if(i > max_reach){
                return false;
            }
            
            int reach = i + nums[i];

            if(reach > max_reach){
                max_reach = reach;
            }

            if(max_reach >= n-1){
                return true;
            }
        }

        return false;
    }
}