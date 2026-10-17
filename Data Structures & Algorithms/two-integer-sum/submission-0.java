class Solution {
    public int[] twoSum(int[] nums, int target) {

        int [] returnArr= new int[6];

        for (int i=0; i < nums.length; i++){

            for (int j=i+1; j < nums.length; j++){

                if(nums[i]+nums[j] == target){
                    returnArr = new int[]{i,j};
                    return returnArr;
                }

            }


        }
        return returnArr;

    }
}
