class Solution {
    public int thirdMax(int[] nums) {
        int n= nums.length;
        int count=1;
        Arrays.sort(nums);
        for(int i=n-2; i>=0; i--){
            if(nums[i]!=nums[i+1]){
                count++;
                if(count==3){
                    return nums[i];
                }
            }
        }
        return nums[n-1];
        
    } 
}