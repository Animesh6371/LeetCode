class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            start = Math.max(start,nums[i]);
            //At the end of the loop it will contain the maximum value of the array;
            end += nums[i];
        }
        //binary search;
        while(start < end)
        {
            //try for the middle as potential answer;
            int mid =start+(end-start)/2;
            
            //calculate howmany pieces you can divide this in with this maximum sum;
            
            int sum=0;//this will be used to store the add value of the element
            int pieces =1;
            for(int num : nums)
            {
                if(sum + num > mid)
                {
                    //we cant add the next elements to the sub array..we have to make a new array;
                    sum = num;
                    pieces++;   
                }
                else
                {
                    sum += num;
                }
            }
            
            if(pieces > k)
            {
                start = mid+1;
            }
            else
            {
                end = mid;
            }
        }
        return end;//here start == end;
    }
}