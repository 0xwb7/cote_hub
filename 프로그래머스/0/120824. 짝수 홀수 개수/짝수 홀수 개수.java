class Solution {
    public static int[] solution(int[] n) {
        int[] ans = {0, 0};

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                ans[0]++;
            } else {
                ans[1]++;
            }
        }

        return ans;
    }
}