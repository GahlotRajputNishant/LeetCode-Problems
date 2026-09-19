class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        for(int i=0; i<arr.length; i++){
            StringBuilder sb=new StringBuilder(arr[i]);
            int left=0, right=sb.length()-1;
            while(left<right){
                char temp=sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                left++;
                right--;
            }
            arr[i]=sb.toString();
        }
        return String.join(" ", arr);

    }
}