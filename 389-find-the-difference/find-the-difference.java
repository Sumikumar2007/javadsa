class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            count[c]--;
            if (count[c] < 0) {
                return c;
            }
        }
        
        return ' ';
    }
}