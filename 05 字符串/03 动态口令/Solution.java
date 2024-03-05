class Solution {
    public String dynamicPassword(String password, int target) {
        String last = password.substring(target);
        String first = password.substring(0, target);
        return last + first;
    }
}
