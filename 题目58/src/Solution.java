class Solution {
    public int lengthOfLastWord(String s) {




        int res=0;

        for(int len=s.length()-1;len>0;len--) {



                if (s.charAt(len) != ' ') {
                    res++;

                } else {
                    if (res==0){continue;}
                    break;
                }
            }



        return res;
    }
}


