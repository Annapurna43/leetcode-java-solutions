class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        HashSet<List<Integer>> result  = new HashSet<>();
        solve(candidates, target, 0, new ArrayList<>(), result);
        return new ArrayList<>(result);
        
    }
    void solve(int[] nums, int target, int i, ArrayList<Integer> current, HashSet<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(i == nums.length || target<0){
            return;
        }

        
        current.add(nums[i]);
        solve(nums, target - nums[i], i+1, current, result);
        current.remove(current.size()-1);
           while(i + 1 < nums.length &&
              nums[i] == nums[i+1]){
            i++;
        }

        solve(nums, target, i+1, current, result);
    }
}