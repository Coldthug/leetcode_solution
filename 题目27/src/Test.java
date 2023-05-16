import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int nums[]={0,1,2,2,3,0,4,2};
        Solution solution = new Solution();
        solution.removeElement(nums,2);


//        int nums[]={0,1,2,2,3,0,4,2};
//        int val=2;
//        int i,j,a=0;
//        for(i=0;i<nums.length;i++){
//            if(nums[i]==val){
//                a++;
//                for (j=i;j<nums.length-1;j++){
//                    nums[j]=nums[j+1];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//        System.out.println(nums.length-a);
    }
}
