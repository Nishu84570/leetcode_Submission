class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i<magazine.length(); i++){
            char letter = magazine.charAt(i);
            map.put(letter , map.getOrDefault(letter , 0) + 1);
        }

        for(int i = 0; i<ransomNote.length(); i++){
            char letter = ransomNote.charAt(i);

            if(map.containsKey(letter)){
                int freq = map.get(letter);

                if(map.get(letter) > 1){
                    map.put(letter , freq - 1);
                }

                else{
                    map.remove(letter);
                }
            }

            else{
                return false;
            }
        }

        return true;
    }
}