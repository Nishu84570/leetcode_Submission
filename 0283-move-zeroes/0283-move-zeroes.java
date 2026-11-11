class Solution {
    public void moveZeroes(int[] nums) {
        int index = -1;

        int i = 0;

        while(i < nums.length){
            if(nums[i] != 0){
                index++;
                int tem = nums[i];
                nums[i] = nums[index];
                nums[index] = tem;
            }

            i++;
        }
    }
}