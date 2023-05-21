import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int q = 0, p = 1;

        while (q<nums.length){
            if (nums[q]==0){
                while (p<nums.length){
                    if (nums[p]!=0){
                        nums[q]=nums[p];
                        p++;
                    }
                }
            }else {q++;}


        }







    }
}