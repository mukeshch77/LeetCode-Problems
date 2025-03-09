class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int[] temp = new int[m];
        // int i = 0, j = 0, k = 0;
        // while(k<m) temp[k] = nums1[k++];
        // k = 0;
        // while(k < m && j < n){
        //     if(temp[k] <= nums2[j]){
        //         nums1[i++] = temp[k++];
        //     }else{
        //         nums1[i++] = nums2[j++];
        //     }
        // }
        // while(k<m) nums1[i++] = temp[k++];
        // while(j<n) nums1[i++] = nums2[j++];

        int r1 = m -1;
        int r2 = nums2.length -1;
        int w = m + n -1;
        while(w >= 0){
            if(r1 >= 0 && r2 >= 0){
                nums1[w] = nums1[r1] > nums2[r2] ? nums1[r1--] : nums2[r2--];
            }else if(r1 >= 0){
                nums1[w] = nums1[r1--];
            }else{
                nums1[w] = nums2[r2--];
            }
            w--;
        }
    }
}
