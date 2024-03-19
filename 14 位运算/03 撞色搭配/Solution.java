class Solution {
    public int[] sockCollocation(int[] sockets) {
        int[] res = new int[2];
        int n = 0;
        for (int socket : sockets)
            n ^= socket;
        n = n & (-n);
        for (int socket : sockets) {
            res[(socket & n) == 0 ? 0 : 1] ^= socket;
        }
        return res;
    }
}
