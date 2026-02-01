import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int x=nums1.length;
        int y=nums2.length;
        HashSet<Integer>first = new HashSet<> ();
        HashSet<Integer>second = new HashSet<> ();

        for(int i=0;i<x;i++){
            first.add(nums1[i]);
        }
        for(int i=0;i<y;i++){
            if(first.contains(nums2[i])){
                second.add(nums2[i]);
            }
        }
        int result[]= new int[second.size()];
        int index=0;
        for(int a:second){
            result[index++]=a;
        }
        return result;
    }
}