class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, 0, s.toCharArray());
        return ans;
        
    }
   void backtrack(List<String> ans, int i, char[] s){
        if(i == s.length){
            ans.add(new String(s));
        }
        else{
            if(Character.isLetter(s[i])){
                s[i] = Character.toUpperCase(s[i]);
                backtrack(ans, i+1, s);
                s[i] = Character.toLowerCase(s[i]);
                backtrack(ans, i+1, s);
            }
            else{
                backtrack(ans, i+1, s);
            }
        }
    }
}