class MedianFinder {
    private Queue<Integer> minHeap;
    private Queue<Integer> maxHeap;
    /** initialize your data structure here. */
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a, b) -> b - a);
    }
    
    public void addNum(int num) {
        maxHeap.offer(num);
        if (!minHeap.isEmpty() && !maxHeap.isEmpty() && maxHeap.peek() > minHeap.peek())
            minHeap.offer(maxHeap.poll());
        if (maxHeap.size() - minHeap.size() > 1)
            minHeap.offer(maxHeap.poll());
        if (minHeap.size() - maxHeap.size() > 1)
            maxHeap.offer(minHeap.poll());
    }
    
    public double findMedian() {
        if (maxHeap.size() == minHeap.size())
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        else if (maxHeap.size() > minHeap.size())
            return maxHeap.peek();
        else
            return minHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
