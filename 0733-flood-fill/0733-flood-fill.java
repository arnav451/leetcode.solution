class Solution {
    public void bfs(int[][]image,int i,int j,int original,int color){
     int n=image.length;
     int m=image[0].length;
     if(i<0||j<0||i>=n||j>=m||image[i][j]!=original){
        return;
     }
     image[i][j]=color;
     bfs(image,i+1,j,original,color);
     bfs(image,i-1,j,original,color);
     bfs(image,i,j+1,original,color);
     bfs(image,i,j-1,original,color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
     int original=image[sr][sc];
     if(original!=color){
     bfs(image,sr,sc,original,color);
     }
     return image;
    }
}