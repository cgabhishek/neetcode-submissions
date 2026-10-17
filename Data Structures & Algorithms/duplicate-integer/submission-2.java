class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> items = new ArrayList<>();
        for (int num : nums){
            if(items.size() > 0 && items.contains(num)){
                return true;
            }else{
                items.add(num);
            }
        }
        return false;
        
    }
}