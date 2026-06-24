class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]= new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==0){
                    dp[i][j]=1; // cause first row and first column me kahin bhi chale jao wahan tak jaane ka no of ways ek hi hai so dp ke andar us block ki value bhi 1 hi ho jaegi , uske baad baaki kisi block pe jaane ki value is sum of uske upar aaur left wale block ki value ka sum.
                }
                else{
                    dp[i][j]= dp[i-1][j]+ dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}