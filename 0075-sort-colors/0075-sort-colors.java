class Solution {
    public void sortColors(int[] nums) {
        int index = -1;

        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            if(nums[left] == 0){
                index++;
                int tem = nums[index];
                nums[index] = nums[left];
                nums[left] = tem;
                left++;
            }

            else if(nums[left] == 1){
                left++;
            }

            else{
                int tem = nums[left];
                nums[left] = nums[right];
                nums[right] = tem;
                right--;
            }
        }
    }
}