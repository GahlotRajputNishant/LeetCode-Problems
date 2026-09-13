class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> frequency=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c=Character.toLowerCase(s.charAt(i));
            frequency.put(c, frequency.getOrDefault(c, 0)+1);
        }
        int maxVowels=0, maxConso=0;
        for(char c:frequency.keySet()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                maxVowels=Math.max(maxVowels, frequency.get(c));
            }
            else{
                maxConso=Math.max(maxConso, frequency.get(c));
            }
        }
        return maxConso+maxVowels;
    }
}