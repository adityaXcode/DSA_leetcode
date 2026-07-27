class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int max1= 0;
        int max2= 0;
        while(n-1>=0){
            if(nums[n-1]> max1){
                max2= max1;
                max1= nums[n-1]; 
            }
            else if(nums[n-1]> max2){
                max2= nums[n-1];
            }
            n= n-1;
        }
        return((max1- 1)*(max2- 1)); 
    }
}