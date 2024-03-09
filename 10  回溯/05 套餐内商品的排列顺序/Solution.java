class Solution {
    List<String> list = new ArrayList<>();
    StringBuilder path = new StringBuilder();
    boolean[] used;

    public String[] goodsOrder(String goods) {
        char[] arr = goods.toCharArray();
        Arrays.sort(arr);
        used = new boolean[arr.length];
        backtracking(arr);
        String[] res = new String[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    void backtracking(char[] arr) {
        if (path.length() == arr.length) {
            list.add(path.toString());
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (used[i])
                continue;
            if (i > 0 && arr[i - 1] == arr[i] && !used[i - 1])
                continue;
            used[i] = true;
            path.append(arr[i]);
            backtracking(arr);
            used[i] = false;
            path.deleteCharAt(path.length() - 1);
        }
    }
}
