class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int count = 1;

        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
               count++;

                if(count <= 2){
                  index++;
                  count++;
                  nums[index] = nums[i]; 
                }

                else{
                    continue;
                }
            }

            else{
                count = 1;
                index++;
                nums[index] = nums[i];
            }
        }

        return index + 1;
    }
}