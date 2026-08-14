class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        char[] newS = s.toCharArray();

        int j = newS.length - 1;

        for(int i = 0; i < newS.length/2; i++){
            if(newS[i] != newS[j])
                return false;
            j--;
        }

        return true;
    }
}
