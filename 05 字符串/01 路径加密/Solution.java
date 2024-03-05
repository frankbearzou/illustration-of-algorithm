class Solution {
    public String pathEncryption(String path) {
        StringBuilder s = new StringBuilder();
        for (char c : path.toCharArray()) {
            if (c == '.')
                s.append(" ");
            else
                s.append(c);
        }
        return s.toString();
    }
}
