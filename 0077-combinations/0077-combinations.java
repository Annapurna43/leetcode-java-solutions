class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        solve(n, k, new ArrayList<>(), 0, result);
        return result;

    }
    void solve(int n, int k, ArrayList<Integer> current, int i, List<List<Integer>> result){
        if(current.size() == k){
            result.add(new ArrayList<>(current));
            return;
        }
        if(i == n){
            return;
        }
        current.add(i+1);
        solve(n,k,current,i+1,result);
        current.remove(current.size()-1);
        solve(n,k,current, i+1, result);
    }
}