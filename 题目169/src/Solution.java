import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {


        HashMap<Integer,Integer> sites = new HashMap<Integer, Integer>();
        int i=0;
        while (i<nums.length){
            if (!sites.containsKey(nums[i])){
                sites.put(nums[i],0);
            }else{
                int n=sites.get(nums[i]);
                sites.replace(nums[i],n++);
            }
            i++;
        }

//            int r=nums.length/2;

        int ans=0,j=0;
        for(Integer value: sites.values()) {
            // 遍历哈希表找最大值
            if (value>j){
                j=value;
            }
        }

        // 输出 key 和 value
        for (Integer z : sites.keySet()) {
            if (sites.get(z)==j&&(sites.get(z)*2)>nums.length){
                ans=z;
            }
        }

        return ans;

    }
}