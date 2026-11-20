class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];

        for(int i = 0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int curr_sum = nums[i] + nums[left] + nums[right];

                if(curr_sum == target){
                    return curr_sum;
                }

                else if(curr_sum < target){
                    left++;
                }

                else{
                    right--;
                }

                if(Math.abs(target - curr_sum) < Math.abs(target - sum)){
                    sum = curr_sum;
                }
            }
        }

        return sum;
    }
}