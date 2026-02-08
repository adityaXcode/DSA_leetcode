class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m= nums2.length;
        ArrayList<Integer> list= new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i])+1);
            }
            else{
                map.put(nums1[i],1);
            }
        }
        for(int j=0;j<m;j++){
            if(map.containsKey(nums2[j]) && map.get(nums2[j])>0){
                list.add(nums2[j]);
                map.put(nums2[j],map.get(nums2[j])-1);
            }
        }
        int result[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}