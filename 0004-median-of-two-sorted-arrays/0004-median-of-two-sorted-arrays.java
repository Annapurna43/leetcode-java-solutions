class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int m = nums1.length, n = nums2.length;
        int left = 0, right = m;
        while(left<=right){
            int partA = (left+right)/2;
            int partB = (m+n+1)/2 - partA;

            int maxLeftA = (partA == 0)? Integer.MIN_VALUE: nums1[partA-1];
            int minRightA = (partA == m)? Integer.MAX_VALUE: nums1[partA];

            int maxLeftB = (partB ==0) ? Integer.MIN_VALUE: nums2[partB-1];
            int minRightB = (partB ==n)? Integer.MAX_VALUE: nums2[partB];
            if((maxLeftA<= minRightB)&&(maxLeftB<= minRightA)){
                 if((m+n)%2==0){
                    return (Math.max(maxLeftA,maxLeftB)+Math.min(minRightA,minRightB))/2.0;
                    }
                else {
                    return Math.max(maxLeftA,maxLeftB);
                }

            }
            else if(maxLeftA > minRightB){
                right = partA-1;
            }
            else {
                left = partA + 1;
            }
           
        }
        return 0.0;
    }
}