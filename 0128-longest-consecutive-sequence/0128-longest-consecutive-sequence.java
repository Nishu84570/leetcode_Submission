class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }

        int max_len = 0;

        for(int n : set){
            int curr_len = 0;

            if(!set.contains(n-1)){
                while(set.contains(n)){
                    n++;
                    curr_len++;
                }

                if(curr_len > max_len){
                    max_len = curr_len;
                }
            }
        }

        return max_len;
    }
}