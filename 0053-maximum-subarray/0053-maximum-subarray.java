class Solution {
    public int maxSubArray(int[] nums) {

        int cs = 0,ms = Integer.MIN_VALUE;

        int maxnum;

        for(int i=0;i<nums.length;i++)
        {
            cs += nums[i];
            ms = Math.max(cs,ms);

            if(cs<0)
            {
                cs = 0;
            }
        }
        return ms;
    }
}