class Solution {
    public char dismantlingAction(String arr) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : arr.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : arr.toCharArray()) {
            if (map.get(c) == 1)
                return c;
        }
        return ' ';
    }
}
