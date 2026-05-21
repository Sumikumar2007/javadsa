class Solution {
    public static void utility(String s) {
        // code here
          char[] charArray = s.toCharArray();
        for(int i=0;i<charArray.length;i++)
        {
            if(i==0||i%2==0)
            {
                System.out.print(charArray[i]); 
            }
        }
    }
}