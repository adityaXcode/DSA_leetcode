class Solution {
    public int mincost(int cost[],int i,int dp[]){
        if(i==0 || i==1)return cost[i];
        if(dp[i]!= -2) return dp[i];
        return dp[i]= cost[i]+ Math.min(mincost(cost,i-1,dp),mincost(cost,i-2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n= cost.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-2); // -2 ya -1 khuch bhi le sakte hai 0 nhi liya cause it can be a value 
        return Math.min(mincost(cost,n-1,dp),mincost(cost,n-2,dp));
    }
}