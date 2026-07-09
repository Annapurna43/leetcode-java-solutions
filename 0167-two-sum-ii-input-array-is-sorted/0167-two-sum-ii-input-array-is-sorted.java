class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length-1;
        int[] ans = new int[2];
        while(high>=low){

            int sum = numbers[high]+numbers[low];

            if(sum == target){
                ans[0]=low + 1;
                ans[1]=high + 1;
                return ans;
            }
            else if(sum> target){
                high--;
            }
            else if(sum<target){
                low++;
            }
        }
    return ans;    
        
    }
}