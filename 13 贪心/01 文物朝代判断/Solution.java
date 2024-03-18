class Solution {
    public boolean checkDynasty(int[] places) {
        int min = 14, max = 0;
        Set<Integer> set = new HashSet<>();
        for (int place : places) {
            if (place == 0)
                continue;
            min = Math.min(min, place);
            max = Math.max(max, place);
            if (set.contains(place))
                return false;
            set.add(place);
        }
        return max - min < 5;
    }
}
