class Solution {
    public String reverseMessage(String message) {
        StringBuilder str = new StringBuilder();
        message = message.trim();
        char[] arr = message.toCharArray();
        int i = arr.length - 1, j = i;
        while (i >= 0) {
            while (i >= 0 && arr[i] != ' ') i--;
            str.append(message.substring(i + 1, j + 1)).append(" ");
            while (i >= 0 && arr[i] == ' ') i--;
            j = i;
        }
        return str.toString().trim();
    }
}
