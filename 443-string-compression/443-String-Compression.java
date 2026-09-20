class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int idx=0;
        for(int i=0; i<n; i++){
            char c=chars[i];
            int count=0;
            while(i<n&& chars[i]==c){
                count++;
                i++;
            }
            if(count==1){
                chars[idx++]=c;
            }
            else{
                chars[idx++]=c;
                for(char digit:Integer.toString(count).toCharArray()){
                    chars[idx++]=digit;
                }
            }
            i--;
        }
        return idx;
    }
}