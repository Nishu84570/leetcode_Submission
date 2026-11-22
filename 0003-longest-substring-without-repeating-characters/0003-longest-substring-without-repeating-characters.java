class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        int max_len = 0;
        int start = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch)){
                start = Math.max(start , map.get(ch) + 1);
            }

            map.put(ch , i);
            max_len = Math.max(max_len , i - start + 1);
        }

        return max_len;
    }
}