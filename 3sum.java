import java.util.Stack;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Stack<List<Integer>> list = new Stack<List<Integer>>();
        //sort the list
        Arrays.sort(nums);
        //use 2 pointer technique:
        for (int u = 0; u < nums.length; u++){
            //prevent duplicate in result
            if(u != 0 && nums[u] == nums[u-1]) 
                continue;
            //ponter 1 going foward
            int j = u+1;
            //pointer 2 going backward
            int k = nums.length-1;
            //run the 2 pointers
            while(j < k){
                if(nums[u] + nums[j] + nums[k] == 0){
                    List<Integer> result = new ArrayList<Integer>(Arrays.asList(nums[u], nums[j], nums[k]));
                    list.push(result);
                    j++;
                     //prevent duplicate in result
                    while(j < k && nums[j] == nums[j-1]) j++;
                } else if (nums[u] + nums[j] + nums[k] < 0) j++; //if sum is less than 0, move j forward
                else k--; // if sum is greater than 0, move k backward
               
            }
        }
        return list;
        
    }
}