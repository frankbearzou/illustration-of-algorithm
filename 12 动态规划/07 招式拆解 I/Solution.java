class Solution {
    public int dismantlingAction(String arr) {
        int max = 0;
        char[] array = arr.toCharArray();
        int n = array.length;
        int l = 0;
        Set<Character> set = new HashSet<>();
        for (int r = 0; r < n; r++) {
            while (l < r && set.contains(array[r])) {
                set.remove(array[l++]);
            }
            set.add(array[r]);
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
