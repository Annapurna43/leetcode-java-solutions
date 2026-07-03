class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //if(nums==null || nums.length==0) return result;
        subset(nums,new ArrayList<Integer>(),0,result);
        return result;

    }
     void subset(int[] nums, ArrayList<Integer> path, int start, List<List<Integer>> result){
            result.add(new ArrayList<>(path));
            for (int i=start; i<nums.length;i++){
                path.add(nums[i]);
                subset(nums,path,i+1,result);
                path.remove(path.size()-1);
            }
        
       /** //accept code
        input.add(nums[index]);
        subset(nums, input, index+1,result);
        // remove the value from input that has already been added to the result
        input.remove(input.size()-1);

        // reject
        subset(nums,input,index+1,result); 
        **/

    }
}