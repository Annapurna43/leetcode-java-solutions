class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> result = new ArrayList<>();
       solve(candidates, 0, target, new ArrayList<>(), result);
       return result;
    }
    void solve(int[] candidates, int index, int target, ArrayList<Integer> current, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(index == candidates.length||target<0){
            return;
        }
        current.add(candidates[index]);
        solve(candidates,index, target-candidates[index], current, result);
        current.remove(current.size()-1);
        solve(candidates,index+1, target, current, result);

    }

}