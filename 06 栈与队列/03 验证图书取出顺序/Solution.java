class Solution {
    public boolean validateBookSequences(int[] putIn, int[] takeOut) {
        int n = putIn.length;
        int i = 0, j = 0;
        Stack<Integer> stack = new Stack<>();
        while (i < n && j < n) {
            stack.push(putIn[i++]);
            while (!stack.isEmpty() && j < n && stack.peek() == takeOut[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
