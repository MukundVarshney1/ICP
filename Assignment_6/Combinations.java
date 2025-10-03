class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        x(ll,ans,1,k,n);
        return ans;
    }
    public static void x(List<Integer> ll,List<List<Integer>> ans,int i,int k,int n){
        if(ll.size()==k){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int idx=i;idx<=n;idx++){
            ll.add(idx);
            x(ll,ans,idx+1,k,n);
            ll.remove(ll.size()-1);
        }
    }
}