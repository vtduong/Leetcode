class Solution {
    public int arrayPairSum(int[] nums) {
        //sort nums into ascending order
        Arrays.sort(nums);
        //get the sum of odd-indexed numbers
        int sum = 0;
        for (int i = 0; i < nums.length; i+=2){
            sum += nums[i];
        }
        return sum;
    }
}