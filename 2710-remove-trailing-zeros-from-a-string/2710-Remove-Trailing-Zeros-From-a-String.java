class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder sb=new StringBuilder(num);
        int i=sb.length()-1;
        while(i>=0&& sb.charAt(i)=='0'){
            sb.deleteCharAt(i);
            i--;
        }
        return sb.toString();
    }
}