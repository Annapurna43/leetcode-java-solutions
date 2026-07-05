class Solution {
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        solve(n, "", 0, 0);
        return result;
    }
    void solve( int n, String current, int open, int close){
        if(current.length()== n*2){
            result.add(current);
            return;
        }
        if(open<n){
            solve(n, current+"(", open+1, close);
        }
        if(close<open){
            solve(n, current+")", open, close+1);
        }

    }
}