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
| [0033-search-in-rotated-sorted-array](https://github.com/Animesh6371/LeetCode/tree/master/0033-search-in-rotated-sorted-array) |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/Animesh6371/LeetCode/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0153-find-minimum-in-rotated-sorted-array](https://github.com/Animesh6371/LeetCode/tree/master/0153-find-minimum-in-rotated-sorted-array) |
| [0162-find-peak-element](https://github.com/Animesh6371/LeetCode/tree/master/0162-find-peak-element) |
| [0410-split-array-largest-sum](https://github.com/Animesh6371/LeetCode/tree/master/0410-split-array-largest-sum) |
| [0792-binary-search](https://github.com/Animesh6371/LeetCode/tree/master/0792-binary-search) |
| [0882-peak-index-in-a-mountain-array](https://github.com/Animesh6371/LeetCode/tree/master/0882-peak-index-in-a-mountain-array) |
## Binary Search
|  |
| ------- |
| [0033-search-in-rotated-sorted-array](https://github.com/Animesh6371/LeetCode/tree/master/0033-search-in-rotated-sorted-array) |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/Animesh6371/LeetCode/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0153-find-minimum-in-rotated-sorted-array](https://github.com/Animesh6371/LeetCode/tree/master/0153-find-minimum-in-rotated-sorted-array) |
| [0162-find-peak-element](https://github.com/Animesh6371/LeetCode/tree/master/0162-find-peak-element) |
| [0410-split-array-largest-sum](https://github.com/Animesh6371/LeetCode/tree/master/0410-split-array-largest-sum) |
| [0792-binary-search](https://github.com/Animesh6371/LeetCode/tree/master/0792-binary-search) |
| [0882-peak-index-in-a-mountain-array](https://github.com/Animesh6371/LeetCode/tree/master/0882-peak-index-in-a-mountain-array) |
## Dynamic Programming
|  |
| ------- |
| [0410-split-array-largest-sum](https://github.com/Animesh6371/LeetCode/tree/master/0410-split-array-largest-sum) |
## Greedy
|  |
| ------- |
| [0410-split-array-largest-sum](https://github.com/Animesh6371/LeetCode/tree/master/0410-split-array-largest-sum) |
## Prefix Sum
|  |
| ------- |
| [0410-split-array-largest-sum](https://github.com/Animesh6371/LeetCode/tree/master/0410-split-array-largest-sum) |
<!---LeetCode Topics End-->