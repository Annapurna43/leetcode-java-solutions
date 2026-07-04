class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> result = new HashSet<>();
        subset(nums, new ArrayList<Integer>(), 0, result);
        return new ArrayList<>(result);

    }
    void subset(int[] nums, ArrayList<Integer> curr, int index, HashSet<List<Integer>> result){
        if(index == nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        subset(nums, curr, index+1,result);
        curr.remove(curr.size()-1);

        subset(nums, curr, index+1,result);

    }
}