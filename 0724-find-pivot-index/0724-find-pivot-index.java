class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        int lefts=0;
        for(int i=0;i<nums.length;i++)
        {
            total += nums[i];
        }

        for(int i=0;i<nums.length;i++)
        {
            int rights= total-lefts-nums[i];

            if(lefts == rights){
                return i;
            }
            lefts += nums[i];
        }
        return -1;
    }
}