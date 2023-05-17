class Solution {
    public int[] plusOne(int[] digits) {

        int i;
        if (digits[0]==0){
            digits[0]=1;
            return digits;

        }
        if (digits[digits.length-1]!=9){
            digits[digits.length-1]++;
            return digits;
        }else{
            int j=0;
            for (i=digits.length-1;i>=0;i--){
                j++;

                if (digits[i]==9){
                    digits[i]=0;
                }else{
                    digits[i]+=1;
                    break;
                }
                if(j==digits.length){
                    int a[]=new int[digits.length+1];
                    a[0]=1;
                    return a;
                }

            }
            return digits;
        }





    }
}