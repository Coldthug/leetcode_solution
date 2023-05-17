public class Test {
    public static void main(String[] args) {
        int num1[]={1},num2[]={};

        Solution solution = new Solution();
        solution.merge(num1,1,num2,0);
        for(Object o:num1){
            System.out.println(o.toString());
        }
    }
}
