class Solution {
    int index = 0;

    public int[] spiralArray(int[][] array) {
        if (array.length == 0)
            return new int[]{};
        int up = 0, down = array.length - 1, left = 0, right = array[0].length - 1;
        int[] arr = new int[(down + 1) * (right + 1)];
        while (up <= down && left <= right) {
            spiralArray(array, arr, up, down, left, right);
            up++;
            down--;
            left++;
            right--;
        }
        return arr;
    }

    void spiralArray(int[][] array, int[] arr, int up, int down, int left, int right) {
        if (up == down) {
            for (int j = left; j <= right; j++) {
                arr[index++] = array[up][j];
            }
        } else if (left == right) {
            for (int i = up; i <= down; i++) {
                arr[index++] = array[i][left];
            }
        } else {
            // up
            for (int j = left; j < right; j++) {
                arr[index++] = array[up][j];
            }
            // right
            for (int i = up; i < down; i++) {
                arr[index++] = array[i][right];
            }
            // down
            for (int j = right; j > left; j--) {
                arr[index++] = array[down][j];
            }
            // left
            for (int i = down; i > up; i--) {
                arr[index++] = array[i][left];
            }
        }
    }
}
