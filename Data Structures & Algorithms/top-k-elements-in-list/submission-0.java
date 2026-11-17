class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            int num = nums[i];
            if(map.get(num) != null){
                int val = map.get(num);
                map.put(num, val+1);
            }else{
                map.put(num, 1);
            }
        }
        // now sort and iterate the map based upon k

        return map.entrySet()
    .stream()
    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
    .limit(k)
    .mapToInt(Map.Entry::getKey)
    .toArray();
        
    }
}
