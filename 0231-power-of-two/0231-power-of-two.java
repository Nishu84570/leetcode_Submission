class Solution {
    public boolean isPowerOfTwo(int n) {
        int binary = n & (n-1);
        
        if(n > 0 && binary == 0){
            return true;
        }

        return false;

    
    }
}