class Solution {
    public int longestPalindromeSubseq(String s) {
        String text1 = s;
        String text2 = new StringBuilder(s).reverse().toString();
        int dp[][] = new int[text1.length()][text2.length()];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        return solve(text1.length()-1, text2.length()-1,text1, text2,dp);
    }

    int solve(int i, int j, String s1, String s2, int dp[][]){
        if(i < 0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)) return 1 + solve(i-1, j-1, s1, s2, dp);

        return dp[i][j] = Math.max(solve(i-1, j, s1, s2, dp), solve(i, j-1, s1, s2, dp));
    }
}