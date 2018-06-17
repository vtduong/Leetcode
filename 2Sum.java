/**
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
**/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {-1,-1};
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                result[0] = i;
                result[1] = map.get(target - nums[i]);
            }
            map.put(nums[i], i);
        }
        if(result[0] > result[1]){
            int temp = result[0];
            result[0] = result[1];
            result[1] = temp;
        }
        return result;
    }
}