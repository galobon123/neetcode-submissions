class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> c = new HashSet<Character>();
        char[] newS = s.toCharArray();
        int l = 0;
        int bLength = 0;


        for(int r = 0; r < newS.length; r++){

            while (c.contains(newS[r])) {
                c.remove(newS[l]);
                l++;
            }
            c.add(newS[r]);

            if(r - l + 1 > bLength){
                bLength = r - l + 1;
            }
            
        }

        return bLength;
    }
}
