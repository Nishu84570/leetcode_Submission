class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }

        int freq = n/3;

        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > freq){
                list.add(entry.getKey());
            }
        }

        return list;
    }
}