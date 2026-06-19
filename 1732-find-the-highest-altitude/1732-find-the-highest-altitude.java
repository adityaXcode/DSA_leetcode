class Solution {
    public int largestAltitude(int[] gain) {
        int n= gain.length;
        int arr[]= new int[n+1];
        arr[0]=0;
        for(int i=0; i<n; i++){
            arr[i+1]= gain[i]+ arr[i];
        }
        Arrays.sort(arr);
        return arr[n+1-1];
    }
}