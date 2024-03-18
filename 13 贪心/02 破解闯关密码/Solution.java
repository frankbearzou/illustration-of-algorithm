class Solution {
    public String crackPassword(int[] password) {
        int n = password.length;
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = String.valueOf(password[i]);
        }
        Arrays.sort(str, (a, b) -> (a + b).compareTo(b + a));
        StringBuilder res = new StringBuilder();
        for (String s : str)
            res.append(s);
        return res.toString();
    }
}
