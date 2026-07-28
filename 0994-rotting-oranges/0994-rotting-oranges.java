class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int freshOrange = 0;
        
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j]==1){
                    freshOrange++;
                }
                if(grid[i][j]==2){
                    q.add(new int[] {i,j});
                }

            }
        }
        if(freshOrange==0){
            return 0;
        }
        if(q.isEmpty()){
            return -1;
        }
        int min = -1;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                int[] cell = q.remove();
                int x = cell[0];
                int y = cell[1];
                for(int[] dir : dirs){
                    int i = x+dir[0];
                    int j = y+dir[1];
                    if(i>=0 && j>=0 && i<m && j<n && grid[i][j]== 1){
                        grid[i][j] = 2;
                        freshOrange--;
                        q.add(new int[] {i,j});
                    }
                }
            }
            min++;
        }
        if(freshOrange == 0){
            return min;
        }
        else return -1;
    }
}