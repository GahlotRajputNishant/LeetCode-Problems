class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0 || s.length()==1) return s.length();
        int i=0;
        int j=1;
        int maxCount=1;
        while (j<s.length()) {
            boolean foundDuplicate=false;
            for (int k=i; k<j; k++) {
                if (s.charAt(k)==s.charAt(j)) {
                    i=k+1;
                    foundDuplicate=true;
                    break;
                }
            }

            if (!foundDuplicate) {
                maxCount=Math.max(maxCount, j - i + 1);
            }
            j++;
        }
        return maxCount;
    }
}
