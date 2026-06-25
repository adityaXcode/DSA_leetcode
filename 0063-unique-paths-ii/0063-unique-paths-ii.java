class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m= obstacleGrid.length;
        int n= obstacleGrid[0].length;
        int dp[][]= new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(obstacleGrid[i][j]==1){ //for checking direct obstacle
                    dp[i][j]=0;
                }
                else if(i==0 && j==0){ //for checking on first block
                    dp[i][j]=1;
                }
                else if(i==0){ //for checking on first row, agar hua toh aage nhi jaenge
                    dp[i][j]=dp[i][j-1];
                }
                else if(j==0){ //for checking in first col same as above
                    dp[i][j]=dp[i-1][j];
                }
                else{ //normal sum of upper+leftblock 
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}