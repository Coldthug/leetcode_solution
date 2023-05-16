public class Test {
    public static void main(String[] args) {
//错误，时间复杂度为O，不符合题目要求

        Solution solution = new Solution();
        int num[]={1,3,5,6};
        int ans=solution.searchInsert(num,2);
        System.out.println(ans);
    }
}
