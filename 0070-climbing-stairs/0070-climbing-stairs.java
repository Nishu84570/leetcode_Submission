class Solution {
    public int climbStairs(int n) {
        int prev2 = 0;
        int prev1 = 1;

        int curr = prev2 + prev1;

        for(int i = 2; i<=n; i++){
            prev2 = prev1;
            prev1 = curr;
            curr = prev2 + prev1;
        }

        return curr;
    }
}