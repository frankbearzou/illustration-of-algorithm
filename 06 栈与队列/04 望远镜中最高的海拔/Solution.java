class Solution {
    public int[] maxAltitude(int[] heights, int limit) {
        int n = heights.length;
        if (n == 0)
            return new int[]{};
        int[] res = new int[n - limit + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && heights[deque.peekLast()] <= heights[i]) {
                deque.pollLast();
            }
            while (!deque.isEmpty() && deque.peek() <= i - limit) {
                deque.pollFirst();
            }
            deque.offer(i);
            if (i - limit + 1 >= 0)
                res[i - limit + 1] = heights[deque.peek()];
        }
        return res;
    }
}
