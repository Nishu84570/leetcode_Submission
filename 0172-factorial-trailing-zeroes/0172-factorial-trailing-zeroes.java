class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        int pro = 5;

        while(n / pro != 0){
            count += n / pro;
            pro *= 5;
        }

        return count;
    }
}