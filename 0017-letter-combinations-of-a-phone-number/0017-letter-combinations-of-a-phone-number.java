class Solution {
    Map<Character,String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return ans;
        }
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl"); 
        map.put('6',"mno"); 
        map.put('7',"pqrs"); 
        map.put('8',"tuv"); 
        map.put('9',"wxyz"); 

        backtrack(ans,0, "" , digits);
        
        return ans;
        
    }
    void backtrack(List<String> ans, int i, String curStr, String digits){
        if(curStr.length()== digits.length()){
            ans.add(curStr);
            return;
        }
        String letters = map.get(digits.charAt(i));
        for(char ch : letters.toCharArray()){
            backtrack(ans, i+1, curStr + ch, digits);
        }

    }
}