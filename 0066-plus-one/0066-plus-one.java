class Solution {
    public int[] plusOne(int[] digits) {
        int x= digits.length;
        for(int i=x-1 ; i>=0 ; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }else{
            digits[i]=0;
            }    
        }
        int arr[]= new int[x+1];
        arr[0]=1;
        return arr;
    }
}