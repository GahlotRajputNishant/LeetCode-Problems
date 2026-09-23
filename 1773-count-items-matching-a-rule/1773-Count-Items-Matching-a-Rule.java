class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx;
        if(ruleKey.equals("type")){
            idx=0;
        }
        else if(ruleKey.equals("color")){
            idx=1;
        }
        else{
            idx=2;
        }
        int count=0;
        for(int i=0; i<items.size(); i++){
            String s=items.get(i).get(idx);
            if(s.equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}