class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        int first_index = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                first_index = mid;
                right = mid - 1;
            }

            else if(nums[mid] < target){
                left = mid + 1;
            }

            else{
                right = mid - 1;
            }
        }



        int i = 0;
        int j = nums.length-1;

        int last_index = -1;

        while(i <= j){
            int mid = i + (j - i) / 2;

            if(nums[mid] == target){
                last_index = mid;
                i = mid + 1;
            }

            else if(nums[mid] < target){
                i = mid + 1;
            }

            else{
                j = mid - 1;
            }
        }

        return new int[] {first_index , last_index};
    }
}