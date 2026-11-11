class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        for(int i = 1; i<nums.length; i++){
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(slow == fast){
                break;
            }
        }

        int start = nums[0];

        for(int i = 1; i<nums.length; i++){
            if(start == slow){
                return start;
            }

            start = nums[start];
            slow = nums[slow];
        }

        return -1;
    }
}