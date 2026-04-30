class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        int current=0;
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum= totalSum+nums[i];
        }
        for(int j=0;j<nums.length;j++){
            if( leftSum == totalSum-leftSum-nums[j]){
                return j;
            }
            leftSum +=nums[j];
        }
        return -1;
    }
}