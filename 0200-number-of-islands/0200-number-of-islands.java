class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m  = grid[0].length;
        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] =='1'){
                    count++;
                    bfs(grid,i,j);
                }
            }
        }
        return count;

    }
    void bfs(char[][] grid, int row, int col){
        int n =grid.length;
        int m = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{row,col});
        grid[row][col] ='0';

        int[][] dir = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };

        while(!q.isEmpty()){
            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];

            for(int[] d : dir){
                int nr = r + d[0];
                int nc = c + d[1];


                if(nr >= 0 && nr <n && nc>=0 && nc<m && grid[nr][nc]=='1'){
                    q.offer(new int[]{nr,nc});
                    grid[nr][nc] = '0';
                }
            }
        }
    }
}