class Solution {
    public int majorityElement(int[] nums) {
        sort(nums);
        int start = 0;
        int end = nums.length-1;
        int mid = start+(end-start)/2;
        
        int result= nums[mid];

        return result;
    }
    public void sort(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}