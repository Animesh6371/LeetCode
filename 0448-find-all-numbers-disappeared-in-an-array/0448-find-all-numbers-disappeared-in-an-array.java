class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correct = nums[i]-1;
            if(nums[i] != nums[correct])
            {
               swap(nums,i,correct);
            }
            else
            {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j = 0;j<nums.length;j++)
        {
            if(nums[j] != j+1)
            {
                ans.add(j+1);
            }
        }
        return ans;
        
    }
    public static void swap(int nums[],int i,int correct)
    {
        int temp = nums[i];
        nums[i] =nums[correct];
        nums[correct]=temp;
    }
}