class Solution {
    public int search(int[] nums, int target) {
            int n  = nums.length;
            int start = 0;
            int end = n-1;
            while(start<=end){
                int middle =  (start+end) /2;

                if(nums[middle] == target){
                    return middle;
                }
                else if(nums[middle] >target){
                    end = middle-1;
                }
                else {
                    start = middle +1;
                }
            }
            return -1;
    }
}
