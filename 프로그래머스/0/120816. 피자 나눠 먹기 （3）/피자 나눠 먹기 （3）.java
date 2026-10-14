class Solution {
    public static int solution(int slice, int n) {
        if (slice > n) {
            return 1;
        } else {
            if (n % slice == 0) {
                return n / slice;
            }

            return n / slice + 1;
        }
    }
}