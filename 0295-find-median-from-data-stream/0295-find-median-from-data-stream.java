class MedianFinder {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

    public MedianFinder() {
        //maxHeap holds first half and meanHeap hols second half
        
        
    }
    
    public void addNum(int num) {
        //maxHeap holds first half and meanHeap hols second half
        maxHeap.add(num);
        if(maxHeap.size()-minHeap.size() > 1){
            minHeap.add(maxHeap.poll());
        }
        // if first half has greater element
        if(maxHeap.size()>0 && minHeap.size()>0){
            if(maxHeap.peek()>minHeap.peek()){
                minHeap.add(maxHeap.poll());
                maxHeap.add(minHeap.poll());
            }
        }
    }
    
    public double findMedian() {

        if(minHeap.size() == maxHeap.size()){
            return (maxHeap.peek() + minHeap.peek())/2.0;
        }
        return maxHeap.peek();
        

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */