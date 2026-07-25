class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list= new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n=n/10;
        }
        int m= list.size();
        Collections.sort(list);
        int prod= list.get(m -1)* list.get(m -2);
        return prod;
        
        
    }
}