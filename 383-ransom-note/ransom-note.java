class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()) return false;
        boolean[] f=new boolean[magazine.length()];
        for(int i=0; i<ransomNote.length(); i++){
            boolean found=false;
            for(int j=0; j<magazine.length(); j++){
                if(!f[j]&& ransomNote.charAt(i)==magazine.charAt(j)){
                    f[j]=true;
                    found=true;
                    break;
                }
            }
            if(!found) return false;
        }
        return true;
    }
}