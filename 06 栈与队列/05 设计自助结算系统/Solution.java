class Checkout {
    private Queue<Integer> queue;
    private Deque<Integer> deque;

    public Checkout() {
        queue = new LinkedList<>();
        deque = new ArrayDeque<>();
    }
    
    public int get_max() {
        if (deque.isEmpty())
            return -1;
        return deque.peek();
    }
    
    public void add(int value) {
        queue.offer(value);
        while (!deque.isEmpty() && deque.peekLast() < value) {
            deque.pollLast();
        }
        deque.offerLast(value);
    }
    
    public int remove() {
        if (queue.isEmpty())
            return -1;
        int res = queue.poll();
        if (!deque.isEmpty() && deque.peek() == res)
            deque.poll();
        return res;
    }
}

/**
 * Your Checkout object will be instantiated and called as such:
 * Checkout obj = new Checkout();
 * int param_1 = obj.get_max();
 * obj.add(value);
 * int param_3 = obj.remove();
 */
