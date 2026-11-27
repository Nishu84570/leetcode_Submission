class Solution {
    public boolean isPalindrome(int x) {
        if(x != 0 && x % 10 == 0 || x < 0){
            return false;
        }

        int rev = 0;

        while(x > rev){
            int digit = x % 10;
            rev = (rev * 10) + digit;
            x /= 10;
        }

        if(x == rev || rev / 10 == x){
            return true;
        }

        return false;
    }
}