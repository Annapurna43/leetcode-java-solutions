class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length){
            return nums;
        }
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i : nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> freq.get(b)-freq.get(a));
        for(int key : freq.keySet()){
            maxHeap.add(key);
        }
        int[] res = new int[k];
        for(int i =0; i<k; i++){
            res[i] = maxHeap.poll();
        }
        return res;


    }
}