class Solution {
    public boolean checkString(String s) {

        int b_count = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == 'a'){
                if(b_count < 1){
                    continue;
                }

                else{
                    return false;
                }
            }

            else if(ch == 'b'){
                b_count++;
            }
        }


        return true;
    }
}