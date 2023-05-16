class Solution {
    public int searchInsert(int[] nums, int target) {

        int ans=0;
        int n;

        for (n=0;n<nums.length;n++){
            if (nums[n]==target){
                ans= n;
                break;
            }
            if (nums[n]>target){
                ans= n;
                break;
            }
            if (nums[nums.length-1]<target){
                ans= nums.length;
            }
        }


        return ans;
    }
}