class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character, Integer> occurence= new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            occurence.put(s.charAt(i), occurence.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0; i<t.length(); i++){
            Character ch = t.charAt(i);
            if(!occurence.containsKey(ch) || occurence.get(ch) == 0){
                return false;
                
            }
            occurence.put(ch, occurence.get(ch)-1);
            
        }
        return true;
        
    }
}