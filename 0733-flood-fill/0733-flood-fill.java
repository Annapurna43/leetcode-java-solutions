class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int row = image.length;
        int col = image[0].length;
        dfs(image, sr, sc, row,col, image[sr][sc], color);
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(image[i][j]==-1){
                    image[i][j] = color;
                }
            }
        }
        return image;
        
    }
    void dfs(int[][] image, int sr,int sc, int row,int col,int oldColor, int color){
        if(sr<0 ||sc<0|| sr>=row || sc>=col || image[sr][sc]!= oldColor){
            return;
        }
        image[sr][sc] = -1;
        dfs(image, sr+1, sc, row,col, oldColor, color);
        dfs(image, sr-1, sc, row,col, oldColor, color);
        dfs(image, sr, sc+1, row,col, oldColor, color);
        dfs(image, sr, sc-1, row,col, oldColor, color);
    }
}