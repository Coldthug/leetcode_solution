class Solution {
    public boolean isPalindrome(String s) {


        int slen=s.length();
        StringBuffer buffer = new StringBuffer();

        for (int i=0;i<s.length();i++){
            if ( (s.charAt(i)>64&&s.charAt(i)<91) || (s.charAt(i)>96 &&s.charAt(i)<123) ) {
                char ch=s.charAt(i);
                buffer.append(Character.toLowerCase(ch));
            }
        }

        String a=buffer.toString();

        int begin=0,end=a.length()-1;
        while(begin<end){
            if (a.charAt(begin)!=a.charAt(end)){
                return false;
            }
            begin++;
            end--;
        }

        return true;
    }
}