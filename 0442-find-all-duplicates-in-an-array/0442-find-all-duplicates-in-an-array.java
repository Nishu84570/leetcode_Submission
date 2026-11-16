class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;

        while(i < nums.length){
            int correct_index = nums[i] - 1;

            if(nums[i] != nums[correct_index]){
                int tem = nums[i];
                nums[i] = nums[correct_index];
                nums[correct_index] = tem;
            }

            else{
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int j = 0; j<nums.length; j++){
            if(j+1 != nums[j]){
                list.add(nums[j]);
            }
        }

        return list;
    }
}