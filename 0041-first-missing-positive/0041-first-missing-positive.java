class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }

        int num = 1;

        for(int i = 0; i<nums.length; i++){
            if(!map.containsKey(num)){
                return num;
            }

            num++;
        }

        return num;
    }
}