class Solution {
    public int characterReplacement(String s, int k) {
        char[] sArray = s.toCharArray();
        int maxLen = 0;
        int f = 0;
        int[] count = new int[26];

        int i = 0;

        for (int j = 0; j < sArray.length; j++){
            count[sArray[j] - 'A']++;

            if(f < count[sArray[j] - 'A']) f = count[sArray[j] - 'A'];

            if((j - i + 1) - f > k){
                count[sArray[i] - 'A']--;
                i++;
            }

            if((j - i + 1) > maxLen) maxLen = (j - i + 1);
        }

        return maxLen;
    }
}
