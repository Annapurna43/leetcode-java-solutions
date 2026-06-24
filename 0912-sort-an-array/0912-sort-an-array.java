class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num: nums){
            minHeap.add(num);
        }
        int[] arr =new int[nums.length];
        for(int i = 0; i<nums.length;i++){
            arr[i] = minHeap.poll();
        }
        return arr;
        
    }
}