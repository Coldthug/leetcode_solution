class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //先拼接后排序

        //合并nums1和nums2
        for (;n>0;n--){
            nums1[m]=nums2[n-1];
            m++;
        }


        //nums1排序：冒泡排序
        int len=nums1.length;
        for (int i=0;i<len;i++){
            for (int j=0;j<len-i-1;j++){
                if(nums1[j] > nums1[j+1]) {
                    int val = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = val;
                }
            }
        }



    }
}