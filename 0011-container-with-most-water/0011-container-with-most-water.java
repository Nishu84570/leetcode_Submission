class Solution {
    public int maxArea(int[] height) {
        int max_water = 0;

        int left = 0;
        int right = height.length-1;

        while(left < right){
            if(Math.min(height[left] , height[right]) * (right - left) > max_water){
                max_water = Math.min(height[left] , height[right]) * (right - left);
            }

            if(height[left] < height[right]){
                left++;
            }

            else{
                right--;
            }
        }

        return max_water;
    }
}