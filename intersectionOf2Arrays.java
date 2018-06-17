/**
Given two arrays, write a function to compute their intersection.
**/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //create an array of unique value
        int[] array1 = IntStream.of(nums1).distinct().toArray();
        Arrays.sort(array1);
        int[] array2 = IntStream.of(nums2).distinct().toArray();
        ArrayList<Integer> result = new ArrayList<Integer>();
        //search array1 for key in array2 using binary search
        for(int num : array2){
           if(binarySearch(num, array1))
               result.add(num);
        }
        int[] a = new int[result.size()];
        for (int i = 0; i < result.size(); i++ ){
            a[i] = result.get(i);
        }
        
        return a;
        
    }
    
    private boolean binarySearch(int key, int[] array){
        int low = 0;
        int high = array.length -1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if(array[mid] == key)
                return true;
            if(array[mid] < key)
                low = mid +1;
            else high = mid -1;
        }
        return false;
    }
}