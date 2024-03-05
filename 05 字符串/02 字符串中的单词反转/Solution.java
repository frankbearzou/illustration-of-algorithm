class Solution {
    public String reverseMessage(String message) {
        int left = 0;
        Stack<String> stack = new Stack<>();
        message = message.trim();
        char[] arr = message.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[left] == ' ') {
                left++;
                continue;
            }
            if (arr[i] == ' ') {
                stack.push(message.substring(left, i));
                left = i;
            }
        }
        stack.push(message.substring(left));
        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) {
            str.append(stack.pop());
            if (!stack.isEmpty()) {
                str.append(" ");
            }
        }
        return str.toString();
    }
}
