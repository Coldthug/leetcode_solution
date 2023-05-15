import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {



        Solution solution=new Solution();
        int a[]={1,2,2,3,3,4,5,6,6};
        solution.removeDuplicates(a);








//        //num[n+1]是否为空，
//        // 为空，return length，
//        // 不为空则将num[n]和num[n+1]比较，
//        // 如果，两数相同，其后数位置-1；两数不同，n+1
//        int nums[]={1,1,2,2,3,3,4,5,6,8,9};
//        int n=0;
//        for (int i=0;i<=nums.length;i++){
//            //判断n+1是否为空
//            if(nums[n+1]!='\0'){
//                if(nums[n]==nums[n+1]){
//                    for(int m=n+1;m<nums.length-n-1;n++) {
//                        nums[n + 1] = nums[n + 2];
//                    }
//                    int r=0;
//                    nums[nums.length-r]='\0';
//                    r++;
//                }else{n=n+1;}
//            }
//            }
//
//        System.out.println(Arrays.toString(nums));
        }
    }

