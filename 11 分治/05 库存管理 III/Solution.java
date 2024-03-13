class Solution {
    public int[] inventoryManagement(int[] stock, int cnt) {
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        for (int num : stock) {
            queue.offer(num);
            if (queue.size() > cnt)
                queue.poll();
        }
        int[] res = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            res[i] = queue.poll();
        }
        return res;
    }
}
