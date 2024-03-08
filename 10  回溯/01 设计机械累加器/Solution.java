class Solution {
    public int mechanicalAccumulator(int target) {
        boolean b = target > 1 && (target += mechanicalAccumulator(target - 1)) > 0;
        return target;
    }
}
