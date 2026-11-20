class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;

        int[] arr = new int[length];
        int index = 0;

        int i = 0;
        int j = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                arr[index] = nums1[i];
                index++;
                i++;
            }

            else{
                arr[index] = nums2[j];
                index++;
                j++;
            }
        }

        while(i < nums1.length){
            arr[index] = nums1[i];
            index++;
            i++;
        }

        while(j < nums2.length){
            arr[index] = nums2[j];
            index++;
            j++;
        }

        if(length % 2 != 0){
            int pos = length / 2;
            return arr[pos]; 
        }

        int pos = length / 2;

        return (double)(arr[pos] + arr[pos-1])/2;

    }
}