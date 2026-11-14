class Solution {
    public boolean isPowerOfTwo(int n) {
        // int binary = n & (n-1);
        
        // if(binary == 0){
        //     return true;
        // }

        // return false;

        if(n == 0){
            return false;
        }

        while(n % 2 == 0){
            n /= 2;
        }

        if(n == 1){
            return true;
        }

        return false;
    }
}