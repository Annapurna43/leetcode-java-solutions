class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
// i, j
        int dp[][] = new int[m+1][n+1];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }

        return solve(m, n, word1, word2, dp);
    }
    
    public int solve(int i, int j, String s1, String s2, int dp[][]){
        if(i <= 0) return j;

        if(j <= 0) return i;

        if(dp[i][j] != -1) return dp[i][j];

        if(s1.charAt(i-1) == s2.charAt(j-1))
        return dp[i][j] =  solve(i-1, j-1, s1, s2, dp);

        int insert = 1 + solve(i, j-1, s1, s2, dp);
        int remove = 1 + solve(i-1, j, s1, s2, dp);
        int replace = 1 + solve(i-1, j-1, s1, s2, dp);

        return dp[i][j] = Math.min(insert, Math.min(remove, replace));

    }

}