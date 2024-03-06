class CQueue {
    private Queue<Integer> queue;

    public CQueue() {
        queue = new LinkedList<>();
    }
    
    public void appendTail(int value) {
        queue.offer(value);
    }
    
    public int deleteHead() {
        if (queue.isEmpty())
            return -1;
        else
            return queue.poll();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
