class Solution {
    public int appendCharacters(String s, String t) {
        int s1 = 0,  t1 = 0;
        while(s1 < s.length() && t1 < t.length()){
           if(s.charAt(s1) == t.charAt(t1)){
            t1++;
           }
           s1++;
        }
        return t.length() - t1;
    }
}
