class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    int a[] = {i,j};
                    return a;
                }
            }
        }
        return null;
    }
}

<!---LeetCode Topics Start-->
# LeetCode Topics
## Array
|  |
| ------- |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/Animesh6371/LeetCode/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0882-peak-index-in-a-mountain-array](https://github.com/Animesh6371/LeetCode/tree/master/0882-peak-index-in-a-mountain-array) |
## Binary Search
|  |
| ------- |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/Animesh6371/LeetCode/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0882-peak-index-in-a-mountain-array](https://github.com/Animesh6371/LeetCode/tree/master/0882-peak-index-in-a-mountain-array) |
<!---LeetCode Topics End-->