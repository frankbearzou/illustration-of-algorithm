class Solution {
    public int encryptionCalculate(int dataA, int dataB) {
        while (dataA != 0) {
            int t = dataA ^ dataB;
            dataA = (dataA & dataB) << 1;
            dataB = t;
        }
        return dataB;
    }
}
