class Solution {
    public int search(int[] nums, int target) {


        int start = 0;
        int end = nums.length - 1;

        return bs(nums,target, start, end);
        
    }

    int bs(int[] nums, int target, int start, int end)
    {
         if (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                return bs(nums, target, start, mid - 1);
            } else if (target > nums[mid]) {
                return bs(nums, target, mid + 1, end);
            } else if (target == nums[mid]) {
                return mid;
            }

        }
        return -1;
    }
}