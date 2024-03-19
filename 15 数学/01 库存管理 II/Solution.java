class Solution {
    public int inventoryManagement(int[] stock) {
        int num = stock[0];
        int count = 1;
        for (int i = 1; i < stock.length; i++) {
            if (num == stock[i]) {
                count++;
            } else {
                if (count == 0) {
                    num = stock[i];
                    count++;
                } else {
                    count--;
                }
            }
        }
        return num;
    }
}
