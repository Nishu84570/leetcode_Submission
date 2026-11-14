class Solution {
    public boolean isPowerOfThree(int n) {
        // if(n < 1){
        //     return false;
        // }

        // int max_pow = 1;

        // while(max_pow < Integer.MAX_VALUE/3){
        //     max_pow *= 3;
        // }

        // if(max_pow % n == 0){
        //     return true;
        // }

        // return false;

        if(n < 1){
            return false;
        }

        if(1162261467 % n == 0){
            return true;
        }

        return false;
    }
}