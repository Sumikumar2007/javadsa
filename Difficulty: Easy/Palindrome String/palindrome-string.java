class Solution {
    boolean isPalindrome(String s) {
        // code here
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String s1=sb.toString();
        if(s1.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
}