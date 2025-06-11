class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int temp[] = new int[nums1.length+nums2.length];
        int k=0;
        int i=0;
        int j=0;
        while(i<=nums1.length-1 && j<=nums2.length-1){
            if(nums1[i] <= nums2[j]){
                temp[k] = nums1[i];
                i++;
            }
            else{
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<=nums1.length-1){
            temp[k++] = nums1[i++];
        }
        while(j<=nums2.length-1){
            temp[k++] = nums2[j++];
        }
        int n = temp.length;

        if(n%2 == 1){
            return temp[n/2];
        }
        else{
            return (temp[n/2-1] + temp[n/2]) / 2.0;
        }
    }
}