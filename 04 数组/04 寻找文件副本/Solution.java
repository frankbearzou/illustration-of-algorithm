class Solution {
    public int findRepeatDocument(int[] documents) {
        int n = documents.length;
        int[] arr = new int[n];
        for (int i : documents) {
            if (arr[i] > 0)
                return i;
            arr[i]++;
        }
        return -1;
    }
}
