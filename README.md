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
| [0004-median-of-two-sorted-arrays](https://github.com/Animesh6371/LeetCode/tree/master/0004-median-of-two-sorted-arrays) |
| [0033-search-in-rotated-sorted-array](https://github.com/Animesh6371/LeetCode/tree/master/0033-search-in-rotated-sorted-array) |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/Animesh6371/LeetCode/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0041-first-missing-positive](https://github.com/Animesh6371/LeetCode/tree/master/0041-first-missing-positive) |
| [0053-maximum-subarray](https://github.com/Animesh6371/LeetCode/tree/master/0053-maximum-subarray) |
| [0059-spiral-matrix-ii](https://github.com/Animesh6371/LeetCode/tree/master/0059-spiral-matrix-ii) |
| [0136-single-number](https://github.com/Animesh6371/LeetCode/tree/master/0136-single-number) |
| [0153-find-minimum-in-rotated-sorted-array](https://github.com/Animesh6371/LeetCode/tree/master/0153-find-minimum-in-rotated-sorted-array) |
| [0162-find-peak-element](https://github.com/Animesh6371/LeetCode/tree/master/0162-find-peak-element) |
| [0169-majority-element](https://github.com/Animesh6371/LeetCode/tree/master/0169-majority-element) |
| [0268-missing-number](https://github.com/Animesh6371/LeetCode/tree/master/0268-missing-number) |
| [0287-find-the-duplicate-number](https://github.com/Animesh6371/LeetCode/tree/master/0287-find-the-duplicate-number) |
| [0410-split-array-largest-sum](https://github.com/Animesh6371/LeetCode/tree/master/0410-split-array-largest-sum) |
| [0442-find-all-duplicates-in-an-array](https://github.com/Animesh6371/LeetCode/tree/master/0442-find-all-duplicates-in-an-array) |
| [0448-find-all-numbers-disappeared-in-an-array](https://github.com/Animesh6371/LeetCode/tree/master/0448-find-all-numbers-disappeared-in-an-array) |
| [0645-set-mismatch](https://github.com/Animesh6371/LeetCode/tree/master/0645-set-mismatch) |
| [0792-binary-search](https://github.com/Animesh6371/LeetCode/tree/master/0792-binary-search) |
| [0882-peak-index-in-a-mountain-array](https://github.com/Animesh6371/LeetCode/tree/master/0882-peak-index-in-a-mountain-array) |
| [0898-transpose-matrix](https://github.com/Animesh6371/LeetCode/tree/master/0898-transpose-matrix) |
| [1482-how-many-numbers-are-smaller-than-the-current-number](https://github.com/Animesh6371/LeetCode/tree/master/1482-how-many-numbers-are-smaller-than-the-current-number) |
| [1505-create-target-array-in-the-given-order](https://github.com/Animesh6371/LeetCode/tree/master/1505-create-target-array-in-the-given-order) |
| [1528-kids-with-the-greatest-number-of-candies](https://github.com/Animesh6371/LeetCode/tree/master/1528-kids-with-the-greatest-number-of-candies) |
| [1603-running-sum-of-1d-array](https://github.com/Animesh6371/LeetCode/tree/master/1603-running-sum-of-1d-array) |
| [1635-number-of-good-pairs](https://github.com/Animesh6371/LeetCode/tree/master/1635-number-of-good-pairs) |
| [2048-build-array-from-permutation](https://github.com/Animesh6371/LeetCode/tree/master/2048-build-array-from-permutation) |
| [2058-concatenation-of-array](https://github.com/Animesh6371/LeetCode/tree/master/2058-concatenation-of-array) |
## Binary Search
|  |
| ------- |
| [0004-median-of-two-sorted-arrays](https://github.com/Animesh6371/LeetCode/tree/master/0004-median-of-two-sorted-arrays) |
| [0033-search-in-rotated-sorted-array](https://github.com/Animesh6371/LeetCode/tree/master/0033-search-in-rotated-sorted-array) |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/Animesh6371/LeetCode/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0153-find-minimum-in-rotated-sorted-array](https://github.com/Animesh6371/LeetCode/tree/master/0153-find-minimum-in-rotated-sorted-array) |
| [0162-find-peak-element](https://github.com/Animesh6371/LeetCode/tree/master/0162-find-peak-element) |
| [0268-missing-number](https://github.com/Animesh6371/LeetCode/tree/master/0268-missing-number) |
| [0287-find-the-duplicate-number](https://github.com/Animesh6371/LeetCode/tree/master/0287-find-the-duplicate-number) |
| [0410-split-array-largest-sum](https://github.com/Animesh6371/LeetCode/tree/master/0410-split-array-largest-sum) |
| [0792-binary-search](https://github.com/Animesh6371/LeetCode/tree/master/0792-binary-search) |
| [0882-peak-index-in-a-mountain-array](https://github.com/Animesh6371/LeetCode/tree/master/0882-peak-index-in-a-mountain-array) |
## Dynamic Programming
|  |
| ------- |
| [0053-maximum-subarray](https://github.com/Animesh6371/LeetCode/tree/master/0053-maximum-subarray) |
| [0410-split-array-largest-sum](https://github.com/Animesh6371/LeetCode/tree/master/0410-split-array-largest-sum) |
| [1013-fibonacci-number](https://github.com/Animesh6371/LeetCode/tree/master/1013-fibonacci-number) |
## Greedy
|  |
| ------- |
| [0410-split-array-largest-sum](https://github.com/Animesh6371/LeetCode/tree/master/0410-split-array-largest-sum) |
## Prefix Sum
|  |
| ------- |
| [0410-split-array-largest-sum](https://github.com/Animesh6371/LeetCode/tree/master/0410-split-array-largest-sum) |
| [1603-running-sum-of-1d-array](https://github.com/Animesh6371/LeetCode/tree/master/1603-running-sum-of-1d-array) |
## Hash Table
|  |
| ------- |
| [0041-first-missing-positive](https://github.com/Animesh6371/LeetCode/tree/master/0041-first-missing-positive) |
| [0141-linked-list-cycle](https://github.com/Animesh6371/LeetCode/tree/master/0141-linked-list-cycle) |
| [0169-majority-element](https://github.com/Animesh6371/LeetCode/tree/master/0169-majority-element) |
| [0268-missing-number](https://github.com/Animesh6371/LeetCode/tree/master/0268-missing-number) |
| [0442-find-all-duplicates-in-an-array](https://github.com/Animesh6371/LeetCode/tree/master/0442-find-all-duplicates-in-an-array) |
| [0448-find-all-numbers-disappeared-in-an-array](https://github.com/Animesh6371/LeetCode/tree/master/0448-find-all-numbers-disappeared-in-an-array) |
| [0645-set-mismatch](https://github.com/Animesh6371/LeetCode/tree/master/0645-set-mismatch) |
| [1482-how-many-numbers-are-smaller-than-the-current-number](https://github.com/Animesh6371/LeetCode/tree/master/1482-how-many-numbers-are-smaller-than-the-current-number) |
| [1635-number-of-good-pairs](https://github.com/Animesh6371/LeetCode/tree/master/1635-number-of-good-pairs) |
## Math
|  |
| ------- |
| [0007-reverse-integer](https://github.com/Animesh6371/LeetCode/tree/master/0007-reverse-integer) |
| [0231-power-of-two](https://github.com/Animesh6371/LeetCode/tree/master/0231-power-of-two) |
| [0268-missing-number](https://github.com/Animesh6371/LeetCode/tree/master/0268-missing-number) |
| [1013-fibonacci-number](https://github.com/Animesh6371/LeetCode/tree/master/1013-fibonacci-number) |
| [1635-number-of-good-pairs](https://github.com/Animesh6371/LeetCode/tree/master/1635-number-of-good-pairs) |
## Bit Manipulation
|  |
| ------- |
| [0136-single-number](https://github.com/Animesh6371/LeetCode/tree/master/0136-single-number) |
| [0231-power-of-two](https://github.com/Animesh6371/LeetCode/tree/master/0231-power-of-two) |
| [0268-missing-number](https://github.com/Animesh6371/LeetCode/tree/master/0268-missing-number) |
| [0287-find-the-duplicate-number](https://github.com/Animesh6371/LeetCode/tree/master/0287-find-the-duplicate-number) |
| [0645-set-mismatch](https://github.com/Animesh6371/LeetCode/tree/master/0645-set-mismatch) |
## Sorting
|  |
| ------- |
| [0169-majority-element](https://github.com/Animesh6371/LeetCode/tree/master/0169-majority-element) |
| [0268-missing-number](https://github.com/Animesh6371/LeetCode/tree/master/0268-missing-number) |
| [0645-set-mismatch](https://github.com/Animesh6371/LeetCode/tree/master/0645-set-mismatch) |
| [1482-how-many-numbers-are-smaller-than-the-current-number](https://github.com/Animesh6371/LeetCode/tree/master/1482-how-many-numbers-are-smaller-than-the-current-number) |
## Two Pointers
|  |
| ------- |
| [0019-remove-nth-node-from-end-of-list](https://github.com/Animesh6371/LeetCode/tree/master/0019-remove-nth-node-from-end-of-list) |
| [0141-linked-list-cycle](https://github.com/Animesh6371/LeetCode/tree/master/0141-linked-list-cycle) |
| [0287-find-the-duplicate-number](https://github.com/Animesh6371/LeetCode/tree/master/0287-find-the-duplicate-number) |
| [0344-reverse-string](https://github.com/Animesh6371/LeetCode/tree/master/0344-reverse-string) |
## Simulation
|  |
| ------- |
| [0059-spiral-matrix-ii](https://github.com/Animesh6371/LeetCode/tree/master/0059-spiral-matrix-ii) |
| [0898-transpose-matrix](https://github.com/Animesh6371/LeetCode/tree/master/0898-transpose-matrix) |
| [1505-create-target-array-in-the-given-order](https://github.com/Animesh6371/LeetCode/tree/master/1505-create-target-array-in-the-given-order) |
| [2048-build-array-from-permutation](https://github.com/Animesh6371/LeetCode/tree/master/2048-build-array-from-permutation) |
| [2058-concatenation-of-array](https://github.com/Animesh6371/LeetCode/tree/master/2058-concatenation-of-array) |
## Counting
|  |
| ------- |
| [0169-majority-element](https://github.com/Animesh6371/LeetCode/tree/master/0169-majority-element) |
| [1635-number-of-good-pairs](https://github.com/Animesh6371/LeetCode/tree/master/1635-number-of-good-pairs) |
## Counting Sort
|  |
| ------- |
| [1482-how-many-numbers-are-smaller-than-the-current-number](https://github.com/Animesh6371/LeetCode/tree/master/1482-how-many-numbers-are-smaller-than-the-current-number) |
## Matrix
|  |
| ------- |
| [0059-spiral-matrix-ii](https://github.com/Animesh6371/LeetCode/tree/master/0059-spiral-matrix-ii) |
| [0898-transpose-matrix](https://github.com/Animesh6371/LeetCode/tree/master/0898-transpose-matrix) |
## String
|  |
| ------- |
| [0344-reverse-string](https://github.com/Animesh6371/LeetCode/tree/master/0344-reverse-string) |
## Recursion
|  |
| ------- |
| [0231-power-of-two](https://github.com/Animesh6371/LeetCode/tree/master/0231-power-of-two) |
| [1013-fibonacci-number](https://github.com/Animesh6371/LeetCode/tree/master/1013-fibonacci-number) |
## Memoization
|  |
| ------- |
| [1013-fibonacci-number](https://github.com/Animesh6371/LeetCode/tree/master/1013-fibonacci-number) |
## Divide and Conquer
|  |
| ------- |
| [0004-median-of-two-sorted-arrays](https://github.com/Animesh6371/LeetCode/tree/master/0004-median-of-two-sorted-arrays) |
| [0053-maximum-subarray](https://github.com/Animesh6371/LeetCode/tree/master/0053-maximum-subarray) |
| [0169-majority-element](https://github.com/Animesh6371/LeetCode/tree/master/0169-majority-element) |
## Linked List
|  |
| ------- |
| [0019-remove-nth-node-from-end-of-list](https://github.com/Animesh6371/LeetCode/tree/master/0019-remove-nth-node-from-end-of-list) |
| [0141-linked-list-cycle](https://github.com/Animesh6371/LeetCode/tree/master/0141-linked-list-cycle) |
<!---LeetCode Topics End-->