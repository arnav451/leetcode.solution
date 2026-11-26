class Solution{
  public void dfs(char[][]grid,boolean[][] vis,int i,int j){
    int m=grid.length;
    int n=grid[0].length;
    if(i<0||i>=m||j<0||j>=n||grid[i][j]=='0'||vis[i][j]){
        return; 
    } 
    vis[i][j]=true; 
    dfs(grid,vis,i-1,j);
    dfs(grid,vis,i+1,j);
    dfs(grid,vis,i,j-1);
    dfs(grid,vis,i,j+1);
  }
    public int numIslands(char[][] grid) {
     int m=grid.length;
     int n=grid[0].length;
     boolean[][] vis=new boolean[m][n];
     int count=0;

     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
         if(grid[i][j]=='1'&& !vis[i][j]){
            count++;
            dfs(grid,vis,i,j);
         }   
        }
     }
     return count; 
    }
}