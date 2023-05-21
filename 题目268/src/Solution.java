import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {

        int len=nums.length;
        Arrays.sort(nums);

        for (int i=0;i<len;i++){
            if (nums[i]!=i){
                return i;
            }

        }







        return 0;






        /** 阶乘超出int取值范围，应该使用累加，
         * 使用缺陷数组的累加和 - 完整数组的累加和 = 缺失的数
        int len=nums.length;
        int res=1;
        int product=1;

        int exist_0=0;
        int exist_1=0;
        //假设除零以外的数都存在，乘积的结果为product
        for (int j=1;j<=len;j++){
            product*=j;
        }
        //计算除零和丢失的数外所有数的乘积res
        for (int i=0;i<len;i++){
            if (nums[i]!=0){
                res*=nums[i];
            }else{
                //判断nums是否含有0
                exist_0=1;
            }
            //判断nums是否含有1
            if (res*nums[i]==res){
                exist_1=1;
            }
        }
        if (exist_0!=1){
            return 0;
        }
        if (exist_1!=1){
            return 1;
        }
        res=product/res;
        return res;
         */
    }
}