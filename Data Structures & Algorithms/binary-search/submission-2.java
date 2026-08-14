class Solution {
    public int search(int[] nums, int target) {
        int r = nums.length - 1;
        int l = 0;
        int n = nums[(r+l)/2];


        while(n != target && l <= r){
            int m = (r+l)/2;
            n = nums[m];

            if(n > target){
                r = m - 1;
            }
            else if(n < target){
                l = m + 1;
            }
        }

        if(nums[(r+l)/2] != target)
            return -1;  
        return (r+l)/2;
    }
}
