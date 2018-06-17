/**
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times
**/
class Solution {
    public int majorityElement(int[] nums) {
        // if(nums.length == 1)
        //     return nums[0];
        Arrays.sort(nums);
        // if(nums.length % 2 == 0){
        //     if(nums[nums.length/2] != nums[nums.length/2 -1])
        //         return nums[nums.length/2+1];    
        // }
        
        return nums[nums.length/2];
    }
}