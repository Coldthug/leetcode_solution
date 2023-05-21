import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {


        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){

            if (nums[i]==nums[i+1]){
                return true;
            }



        }

        return false;




/**     遍历超时
        int p=0;
        while (p<nums.length){
            int q=nums.length-1;
            while (q>=0){
                if (p!=q){
                    if (nums[p]==nums[q]){
                        return true;
                    }
                }
                q--;
            }
            p++;
        }
        return false;
 */
    }
}