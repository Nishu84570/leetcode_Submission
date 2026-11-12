class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        int i = 0;

        while(i < n){
            int curr_index = nums[i] - 1;

            if(nums[i] <= 0 || nums[i] > n){
                i++;
            }

            else if(nums[i] != nums[curr_index]){
                int tem = nums[i];
                nums[i] = nums[curr_index];
                nums[curr_index] = tem;
            }

            else{
                i++;
            }
        }

        int num = 1;

        for(int j = 0; j<nums.length; j++){
            if(nums[j] != num){
                return num;
            }

            num++;
        }

        return num;
    }
}