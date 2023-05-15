

class Solution {
    public int removeDuplicates(int[] nums) {

        int p=0,q=1;

        for(int i=1;i<nums.length;i++){
            if(nums[p]==nums[q]){
                q++;

            }else{
                nums[p+1]=nums[q];
                p++;
                q++;
            }
        }


        return p+1;
    }
}
    